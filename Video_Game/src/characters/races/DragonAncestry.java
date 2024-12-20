package characters.races;

public enum DragonAncestry {
    BLACK("Noir"),
    BLUE("Bleu"),
    BRASS("Laiton"),
    BRONZE("Bronze"),
    COPPER("Cuivre"),
    GOLD("Or"),
    GREEN("Vert"),
    RED("Rouge"),
    SILVER("Argent"),
    WHITE("Blanc");

    private final String name;

    DragonAncestry(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
