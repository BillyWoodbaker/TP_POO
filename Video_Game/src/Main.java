
import characters.Ability;
import characters.races.Nain;
import characters.races.Halfling;
import characters.races.Trait;
import characters.Character;

import java.util.EnumMap;

public class Main {
    public static void main(String[] args) {
        // Création des caractéristiques de base
        EnumMap<Ability, Integer> abilities = new EnumMap<>(Ability.class);
        abilities.put(Ability.STRENGTH, 10);
        abilities.put(Ability.DEXTERITY, 14);
        abilities.put(Ability.CONSTITUTION, 12);
        abilities.put(Ability.INTELLIGENCE, 13);
        abilities.put(Ability.WISDOM, 10);
        abilities.put(Ability.CHARISMA, 8);

        // Test avec un Nain
        Character nain = new Character(abilities, 40, new Nain(), "Guerrier", "Thorin", 150, "Petit mais robuste", "Seigneur des mines.");
        for (Trait trait : nain.getRace().getTraitList()) {
            trait.applyEffect(nain); // Applique chaque trait
        }
        System.out.println("Proficiencies du Nain : Constitution -> " + nain.isProficientInSavingThrow(Ability.CONSTITUTION));

    }
}

