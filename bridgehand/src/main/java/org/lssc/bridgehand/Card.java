package org.lssc.bridgehand;

public class Card {
    private final Rank rank;

    public Card(Rank rank) {
        this.rank = rank;
    }

    public static Card valueOf(Rank rank) {
        return new Card(rank);
    }

    public Points points() {
        if (rank.equals(Rank.ACE)){
            return Points.valueOf(4);
        }

        if (rank.equals(Rank.KING)){
            return Points.valueOf(3);
        }

        return Points.valueOf(2);
    }
}
