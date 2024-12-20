package characters;

import characters.races.Race;
import utils.DiceRoller;

import java.util.HashSet;
import java.util.EnumMap;
import java.util.Set;

// Classe mère, définit les attributs communs entre les personnages joueurs (PJ) et non-joueurs (PNJ).
public class Character {

    private EnumMap<Ability, Integer> abilities; // Caractéristiques principales
    private Set<Skill> proficientSkills; // Liste des compétences maîtrisées
    private Set<Ability> proficientSavingThrows; // Liste des jets de sauvegarde maîtrisés
    private int maxHP; // Points de vie maximum
    private int currentHP; // Points de vie actuels
    private Race race; // Race du personnage
    private String characterClass; // Classe du perso
    private String name;        // Nom du perso
    private int age;            // Age du perso
    private String appearance;  // Description du perso
    private String backstory;   // Histoire du perso

    // Constructeur : initialise les caractéristiques, maîtrises, points de vie, race et classe
    public Character(EnumMap<Ability, Integer> abilities, int maxHP, Race race, String characterClass,
                     String name, int age, String appearance, String backstory) {
        this.abilities = abilities;
        this.proficientSkills = new HashSet<>();
        this.proficientSavingThrows = new HashSet<>();
        this.maxHP = maxHP;
        this.currentHP = maxHP;
        this.race = race;
        this.characterClass = characterClass;
        this.name = name != null ? name : "Inconnu"; // Nom par défaut
        this.age = age > 0 ? age : 0; // Age par défaut à 0 si invalide
        this.appearance = appearance != null ? appearance : "Non spécifié"; // Apparence par défaut
        this.backstory = backstory != null ? backstory : "Non spécifiée"; // Histoire par défaut
    }

    //Applique les bonus de caractéristiques en fonction de la race
    private EnumMap<Ability, Integer> applyRaceModifiers(EnumMap<Ability, Integer> abilities, Race race) {
        EnumMap<Ability, Integer> modifiedAbilities = new EnumMap<>(abilities);
        race.getAbilityScoreModifiers().forEach((ability, bonus) ->
        modifiedAbilities.merge(ability, bonus, Integer::sum)
        );
        return modifiedAbilities;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
        this.abilities = applyRaceModifiers(this.abilities, race);
    }

    // Effectue un jet de compétence (1d20 + bonus de compétence)
    public int rollSkillCheck(Skill skill) {
        int skillBonus = getSkillBonus(skill);
        int diceRoll = DiceRoller.rollD20();
        return diceRoll + skillBonus;
    }

    // Définit ou retire la maîtrise d'une compétence
    public void setSkillProficiency(Skill skill, boolean isProficient) {
        if (isProficient) {
            proficientSkills.add(skill);
        } else {
            proficientSkills.remove(skill);
        }
    }

    // Vérifie si une compétence est maîtrisée
    public boolean isProficientInSkill(Skill skill) {
        return proficientSkills.contains(skill);
    }

    // Calcule le bonus total pour une compétence
    public int getSkillBonus(Skill skill) {
        Ability relatedAbility = skill.getRelatedAbility();
        int abilityModifier = getAbilityModifier(relatedAbility);
        int proficiencyBonus = isProficientInSkill(skill) ? 2 : 0;
        return abilityModifier + proficiencyBonus;
    }

    // Définit ou retire la maîtrise d'un jet de sauvegarde
    public void setSavingThrowProficiency(Ability ability, boolean isProficient) {
        if (isProficient) {
            proficientSavingThrows.add(ability);
        } else {
            proficientSavingThrows.remove(ability);
        }
    }

    // Vérifie si un jet de sauvegarde est maîtrisé
    public boolean isProficientInSavingThrow(Ability ability) {
        return proficientSavingThrows.contains(ability);
    }

    // Effectue un jet de sauvegarde (1d20 + modificateur + bonus de maîtrise)
    public int rollSavingThrow(Ability ability) {
        int abilityModifier = getAbilityModifier(ability);
        int proficiencyBonus = isProficientInSavingThrow(ability) ? 2 : 0;
        int diceRoll = DiceRoller.rollD20();
        return diceRoll + abilityModifier + proficiencyBonus;
    }

    // Récupère la valeur brute d'une caractéristique
    public int getAbilityScore(Ability ability) {
        return abilities.getOrDefault(ability, 10);
    }

    // Calcule le modificateur d'une caractéristique
    public int getAbilityModifier(Ability ability) {
        int abilityScore = getAbilityScore(ability);
        return (abilityScore - 10) / 2;
    }

    // Réduit les points de vie actuels en fonction des dégâts reçus
    public void takeDamage(int damage) {
        if (damage < 0) {
            System.out.println("Les dégâts ne peuvent pas être inférieurs à zéro");
            return;
        }
        currentHP -= damage;
        currentHP = Math.max(0, currentHP);
    }

    // Soigne le personnage en ajoutant des points de vie
    public void healing(int heal) {
        if (heal < 0) {
            System.out.println("Les soins ne peuvent pas être négatifs");
            return;
        }
        currentHP += heal;
        currentHP = Math.min(currentHP, maxHP);
    }

    // Définit directement les points de vie actuels
    public void setHP(int newHP) {
        if (newHP < 0 || newHP > maxHP) {
            System.out.println("Valeur non valide");
            return;
        }
        currentHP = newHP;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        // Informations de base
        sb.append("Nom: ").append(name).append("\n");
        sb.append("Âge: ").append(age).append("\n");
        sb.append("Apparence: ").append(appearance).append("\n");
        sb.append("Histoire: ").append(backstory).append("\n");

        // Informations existantes
        sb.append("Race: ").append(race).append("\n");
        sb.append("Classe: ").append(characterClass).append("\n");
        sb.append("Points de vie: ").append(currentHP).append("/").append(maxHP).append("\n");

        // Caractéristiques
        sb.append("Caractéristiques:\n");
        for (Ability ability : abilities.keySet()) {
            int score = abilities.get(ability);
            int modifier = getAbilityModifier(ability);
            sb.append("  - ").append(ability).append(": ").append(score).append(" (Mod: ").append(modifier >= 0 ? "+" : "").append(modifier).append(")\n");
        }

        // Compétences maîtrisées
        sb.append("Compétences maîtrisées: ");
        if (proficientSkills.isEmpty()) {
            sb.append("Aucune");
        } else {
            for (Skill skill : proficientSkills) {
                sb.append(skill).append(", ");
            }
            sb.setLength(sb.length() - 2); // Retire la dernière virgule et l'espace
        }
        sb.append("\n");

        // Jets de sauvegarde maîtrisés
        sb.append("Jets de sauvegarde maîtrisés: ");
        if (proficientSavingThrows.isEmpty()) {
            sb.append("Aucun");
        } else {
            for (Ability ability : proficientSavingThrows) {
                sb.append(ability).append(", ");
            }
            sb.setLength(sb.length() - 2); // Retire la dernière virgule et l'espace
        }
        sb.append("\n");

        return sb.toString();
    }


}
