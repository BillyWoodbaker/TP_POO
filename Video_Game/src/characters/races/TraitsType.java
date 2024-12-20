package characters.races;

import characters.Ability;
import characters.Character;
import characters.Skill;

public enum TraitsType implements Trait {
    DARKVISI0N("Vision dans le noir", "¨Permet de voir dans le noir jusqu'à une certaine distance", context -> {
        System.out.println("Ce personnage peut voir dans l'obscurité");
    }),
    TRANSE("Transe", "Les elfes méditent au lieu de dormir et leur repos long dure 4h au lieu de 8h", context -> {
        System.out.println("Ce personnage n'a besoin que de 4h pour se reposer");
    }),
    DWARFRES("Résilience naine", "Avantage aux jets de sauvegarde contre le poison et résistance aux dégâts de poison.",
            context -> {
                if (context instanceof Character) {
                    Character character = (Character) context;
                    character.setSavingThrowProficiency(Ability.CONSTITUTION, true); // Ajoute la maîtrise en Constitution (poison)
                    System.out.println("Avantage aux jets de sauvegarde contre le poison activé.");
                }
            }),
    LUCKY("Chanceux", "Si le personnage fait un 1 sur un d20, vous pouvez relancer le dé et devez utiliser le nouveau résultat.",
            context -> {
                System.out.println("Ce personnage peut relancer un d20");
            }),
    NATAGILITY("Agilité naturelle", "Capacité à se déplacer à travers l'espace des créatures plus grandes.", context -> {
        System.out.println("Ce personnage peut se déplacer à travers l'espace des autres créatures");
    }),
    RUSE("Ruse gnome","Avantage contre certains sorts.", context ->{
        System.out.println("Ce personnage lance 2 d20 et garde le meilleur résultat (Int, Sag, Cha contre la magie )");
    }),
    INFRES("Résistance infernale", "Résistance naturelle aux effets enflammés.", context ->{
        System.out.println("Ce personnage résiste aux dégâts de feu");
    }),
    HERINF("Héritage Infernal", "Vous connaissez le sort Thaumaturgie et pouvez lancer Charme-personne et Obscurité à des niveaux supérieurs.",
            context -> {
                System.out.println("Ce personnage connait les sorts Thaumaturgie, Charme-personne, Obscurité");
            }),
    POLYVALENCE("Polyvalence", "Maîtrise de compétences supplémentaires", context -> {
        if (context instanceof Character) {
            Character character = (Character) context;
            // Implémentation simplifiée : ajout de compétences par défaut
            character.setSkillProficiency(Skill.INSIGHT, true); // Ex : Compétence 1
            character.setSkillProficiency(Skill.ACROBATICS, true); // Ex : Compétence 2
            System.out.println("Proficiency en Insight et Acrobatics ajoutées (par défaut, à adapter).");
        }
    }),
    SAVATTACK("Attaque sauvage", "Capacité à infliger des dégâts supplémentaires lors d'un coup critique.", context -> {
        System.out.println("Lorsque ce personnage inflige un coup critique, lance un dé de dégats suplémentaire");
    }),
    IMPSTAM("Endurance Implacable", "Capacité à survivre à un coup qui vous aurait normalement mis à terre une fois par repose long.", context -> {
        System.out.println("Ce personnage reste à un point de vie pour un coup qui l'aurait mit à 0 (1x par repos long)");
    }),
    DRACBREATH("Souffle draconique", "Inflige des dégâts de type associé à votre ascendance draconique.", context -> {
        System.out.println("Ce personnage a la capacité à exhaler une attaque élémentaire (selon Ancètre Draconique)");
    }),
    DAMRES("Résistance aux dégâts", "Résistance aux dégâts de feu, froid, acide, poison ou électricité, selon votre ascendance.", context -> {
        System.out.println("Ce personnage a une résistance aux dégâts liés à votre ascendance draconique");
    }),
    KEEN("Perception aiguisée", "Permet d'ajouter une proficience en perception", context -> {
        if (context instanceof Character) {
            Character character = (Character) context;
            character.setSkillProficiency(Skill.PERCEPTION, true);
        }
    }),
    FEYANCESTRY("Ancêtres féériques", "Résistance aux effets de charme et au sommeil magique.", context -> {
        if (context instanceof Character) {
            Character character = (Character) context;
            character.setSavingThrowProficiency(Ability.CHARISMA, true); // Ajoute un avantage contre les charmes
            System.out.println("Avantage aux jets de sauvegarde contre les charmes activé.");
        }
    }),
    BRAVE("Brave", "Les halfelins sont résistants à la peur", context -> {
        if (context instanceof Character) {
            Character character = (Character) context;
            character.setSavingThrowProficiency(Ability.WISDOM, true); // Ajoute un avantage aux jets contre la peur
            System.out.println("Avantage aux jets de sauvegarde contre l'état de peur activé.");
        }
    }),
    MENACING("Menaçant", "Gagne une proficience pour l'intimmidation", context -> {
        if (context instanceof Character) {
            Character character = (Character) context;
            character.setSkillProficiency(Skill.INTIMIDATION, true);
        }
    })
    ;



    private final String name;
    private final String description;
    private final TraitEffect effect;

    TraitsType(String name, String description, TraitEffect effect) {
        this.name = name;
        this.description = description;
        this.effect = effect;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public void applyEffect(Object context) {
        effect.apply(context);
    }

    public interface TraitEffect {
        void apply(Object context);
    }
}
