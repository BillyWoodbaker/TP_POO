package characters.races;

import characters.Ability;
import java.util.List;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

public class DemiOrc extends Race {

    public List<Trait> getTraitList() {
        return List.of(
                TraitsType.MENACING,
                TraitsType.SAVATTACK,
                TraitsType.IMPSTAM,
                TraitsType.DARKVISI0N
        );
    }

    public Map<Ability, Integer> getAbilityScoreModifiers(){
        Map<Ability, Integer> modifiers = new EnumMap<>(Ability.class);
        modifiers.put(Ability.STRENGTH, 2);
        modifiers.put(Ability.CONSTITUTION, 1);
        return modifiers;
    }

    public int getSpeed(){
        return 30;
    }

    public String getName() {
        return "Demi-Orc";
    }
}
