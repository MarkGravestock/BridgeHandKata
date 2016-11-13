package org.lssc.bridgehand;

public class Card {
    public static Card valueOf(Rank rank) {
        return new Card();
    }

    public Points points() {
        return Points.valueOf(4);
    }
}
