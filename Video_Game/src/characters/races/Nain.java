package characters.races;

import characters.Ability;
import java.util.List;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

public class Nain extends Race {

    public List<Trait> getTraitList() {
        return List.of(
                TraitsType.DWARFRES,
                TraitsType.DARKVISI0N
        );
    }

    public Map<Ability, Integer> getAbilityScoreModifiers() {
        Map<Ability, Integer> modifiers = new EnumMap<>(Ability.class);
        modifiers.put(Ability.CONSTITUTION, 2);
        return modifiers;
    }

    public int getSpeed() {
        return 25;
    }

    public String getName() {
        return "Nain";
    }
}
