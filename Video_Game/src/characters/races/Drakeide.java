package characters.races;

import characters.Ability;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

public class Drakeide extends Race {

    public List<Trait> getTraitList() {
        return List.of(
                TraitsType.DRACBREATH,
                TraitsType.DAMRES
        );
    }

    private final DragonAncestry ancestry;

    public Drakeide(DragonAncestry ancestry) {
        this.ancestry = ancestry;
    }

    @Override
    public Map<Ability, Integer> getAbilityScoreModifiers() {
        Map<Ability, Integer> modifiers = new EnumMap<>(Ability.class);
        modifiers.put(Ability.STRENGTH, 2);   // +2 en Force
        modifiers.put(Ability.CHARISMA, 1);   // +1 en Charisme
        return modifiers;
    }

    @Override
    public int getSpeed() {
        return 30; // Vitesse : 30 pieds
    }

    @Override
    public String getName() {
        return "Drakéide (" + ancestry.getName() + ")";
    }

    // Getter pour l'ascendance draconique
    public DragonAncestry getAncestry() {
        return ancestry;
    }
}
