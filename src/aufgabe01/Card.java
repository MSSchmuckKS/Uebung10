package aufgabe01;

/**
 * The java class for creating playing cards of the game <i>Abracadabra: The Union</i> with a given name, a color and a release date.
 */
public class Card implements Comparable {
    private final String name, colour;
    public static final String WHITE = "1", BLUE = "2", BLACK = "3", RED = "4", GREEN = "5";
    private final int relYear;

    /**
     * The constructor of Card objects.
     *
     * @param name    The name of the card
     * @param colour  The colour of the card
     * @param relYear The release year of the card
     */
    public Card(String name, String colour, int relYear) {
        this.name = name;
        this.colour = colour;
        this.relYear = relYear;
    }

    /**
     * @return the value of the private field <p>name</p>
     */
    public String getName() {
        return name;
    }

    /**
     * @return the value of the private field <p>colour</p>
     */
    public String getColour() {
        return colour;
    }

    /**
     * @return the value of the private field <p>relYear</p>
     */
    public int getRelYear() {
        return relYear;
    }



    @Override
    public int compareTo(Object o) {
        Card card = (Card) o;

        // comparing release year
        int yearCompare = this.relYear - card.relYear;
        if (yearCompare != 0) {
            return yearCompare;
        } else {

            // comparing colours
            int colourCompare = this.colour.compareTo(card.colour);
            if (colourCompare != 0) {
                return colourCompare;
            } else {

                // comparing name
                return this.name.compareTo(card.name);
            }
        }
    }
}
