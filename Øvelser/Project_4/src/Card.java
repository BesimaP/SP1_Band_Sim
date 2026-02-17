    public class Card {
        String suit;
        String rank;
        int value;

        Card(String suit, String rank, int value) {
            this.suit = suit;
            this.rank = rank;
            this.value = value;
        }
    }

    Card[] createDeck() {
        Card[] deck = new Card[52];
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

        int index = 0;
        for (int s = 0; s < suits.length; s++) {
            for (int r = 0; r < ranks.length; r++) {
                deck[index] = new Card(suits[s], ranks[r], r + 2);
                index = index + 1;
            }
        }

        return deck;
    }

    void printDeck(Card[] deck) {
        for (int i = 0; i < deck.length; i++) {
            System.out.println(deck[i].rank + " of " + deck[i].suit);
        }
    }

    int findHighestCard(Card[] hand) {
        int highestIndex = 0;
        for (int i = 1; i < hand.length; i++) {
            if (hand[i].value > hand[highestIndex].value) {
                highestIndex = i;
            }
        }
        return highestIndex;
    }

    int calculateHandValue(Card[] hand) {
        int total = 0;
        for (int i = 0; i < hand.length; i++) {
            total = total + hand[i].value;
        }
        return total;
    }

    void main() {
        Card[] deck = createDeck();

        // Create a hand of 5 cards
        Card[] hand = new Card[5];
        hand[0] = deck[0];   // 2 of Hearts
        hand[1] = deck[13];  // 2 of Diamonds
        hand[2] = deck[25];  // King of Diamonds
        hand[3] = deck[38];  // Queen of Clubs
        hand[4] = deck[51];  // Ace of Spades

        System.out.println("Your hand:");
        printDeck(hand);

        int highest = findHighestCard(hand);
        System.out.println("\nHighest card: " + hand[highest].rank + " of " + hand[highest].suit);

        int handValue = calculateHandValue(hand);
        System.out.println("Hand value: " + handValue);
    }
