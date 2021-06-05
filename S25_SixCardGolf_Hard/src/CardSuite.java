
public enum CardSuite {

    SPADES("Spades", "A"),
    HEARTS("Hearts", "B"),
    DIAMONDS("Diamonds", "C"),
    CLUBS("Clubs", "D");

    private final String name;
    private final String unicodeSymbol;

    CardSuite(String name, String unicodeSymbol){
        this.name = name;
        this.unicodeSymbol = unicodeSymbol;
    }

    public String getName() {
        return name;
    }

    public String getUnicodeSymbol() {
        return unicodeSymbol;
    }
}
