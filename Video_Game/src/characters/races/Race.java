package characters.races;

import characters.Ability;
import java.util.Map;
import java.util.List;

public abstract class Race {

    public abstract List<Trait> getTraitList();

    public abstract Map<Ability, Integer> getAbilityScoreModifiers();

    public abstract int getSpeed();

    public abstract String getName();
}
