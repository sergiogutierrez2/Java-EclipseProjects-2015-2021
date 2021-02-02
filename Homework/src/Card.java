import java.util.Comparator;

public class Card implements Comparable<Card> {
    private static String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9",
            "10", " Jack ", " Queen ", " King ", " Ace "
    };
    private static String[] SUITS = { " Clubs ", " Diamonds ", " Hearts ", " Spades " };
    private final int suit;
    private final int rank;

    public Card(int suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public boolean equals(Card other) {
        return compareTo(other) == 0;
    }

    public String toString() {
        return RANKS[rank] + " of " + SUITS[suit];
    }

    public int compareTo(Card that) {
        if (suit < that.suit || suit == that.suit && rank < that.rank) {
            return -1;
        }
        else if (suit == that.suit && rank == that.rank) {
            return 0;
        }
        else {
            return 1;
        }
    }

    public static class SuitOrder implements Comparator<Card> {
        public int compare(Card c1, Card c2) {
            return c1.suit - c2.suit;
        }
    }

    public static class ReverseRankOrder implements Comparator<Card> {
        public int compare(Card c1, Card c2) {
            return c2.rank - c1.rank;
        }
    }
}
