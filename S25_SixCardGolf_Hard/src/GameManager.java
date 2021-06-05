import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class GameManager {

    private int pointsP1;
    private int pointsP2;
    private Card[] player1Cards = new Card[6];
    private Card[] players2Cards = new Card[6];
    private final static String[] rank = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "D", "E"};

    public GameManager() {
        this.pointsP1 = 0;

        Card[] deck = new Card[52];
        int cardNumber = 0;
        for (CardSuite suite : CardSuite.values()) {
            for (int i = 0; i < rank.length; i++) {
                deck[cardNumber] = new Card(suite, rank[i]);
                cardNumber++;
            }
        }

        shuffleArray(deck);
        for(int i = 0; i < 6; i++){
            player1Cards[i] = deck[i];
            players2Cards[i] = deck[i + 6];
        }
    }

    static void shuffleArray(Card[] deck) {
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = deck.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            Card card = deck[index];
            deck[index] = deck[i];
            deck[i] = card;
        }
    }

    public Card[] getPlayersCards(int playerID) {
        if(playerID == 0){
            return player1Cards;
        }
        else {
            return players2Cards;
        }
    }

}



