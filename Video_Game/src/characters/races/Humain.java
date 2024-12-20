package characters.races;

import characters.Ability;
import java.util.List;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Map;

public class Humain extends Race {

    public List<Trait> getTraitList(){
         return List.of();
    }

    public Map<Ability, Integer> getAbilityScoreModifiers() {
        Map<Ability, Integer> modifiers = new EnumMap<>(Ability.class);
        for (Ability ability : Ability.values()){
            modifiers.put(ability, 1);
        }
        return modifiers;
    }

    public int getSpeed () {
        return 30;
    }

    public String getName (){
        return "Humain";
    }
}
