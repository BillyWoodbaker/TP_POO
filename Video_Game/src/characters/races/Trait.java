package characters.races;

public interface Trait {

    String getName();

    void applyEffect(Object context);

    String getDescription();

}
