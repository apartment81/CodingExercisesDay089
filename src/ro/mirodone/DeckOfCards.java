package ro.mirodone;

public class DeckOfCards {

    // make the cards
    private int[] deck = new int[52];

    private String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
    private String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};


    public void generateCards() {

        // intitialize cards
        for (int i = 0; i < deck.length; i++) {
            deck[i] += i;
        }

        // shuffle cards

        for (int i = 0; i < deck.length; i++) {

            int index = (int) (Math.random() * deck.length); // pick a random spot in the deck

            int x = deck[i];  // set a temp variable to hold the current card

            deck[i] = deck[index]; // set the current card to the value at the randomly chosen spot

            deck[index] = x; // set the randomly chosen spot to hold the temp value
        }
        // display four cards

        for (int i = 0; i < 4; i++) {

            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];

            System.out.println("You have the " + rank + " of " + suit);

        }


    }


}
