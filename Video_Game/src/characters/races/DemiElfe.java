package characters.races;

import characters.Ability;
import java.util.List;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

public class DemiElfe extends Race {

    public List<Trait> getTraitList() {
        return List.of(
                TraitsType.FEYANCESTRY,
                TraitsType.POLYVALENCE,
                TraitsType.DARKVISI0N
        );
    }

    public Map<Ability, Integer> getAbilityScoreModifiers(){
        Map <Ability, Integer> modifiers = new EnumMap<>(Ability.class);
        modifiers.put(Ability.CHARISMA, 2);
        return modifiers;
    }

    public int getSpeed(){
        return 30;
    }

    public String getName(){
        return "Demi-Elfe";
    }
}