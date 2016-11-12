package org.lssc.bridgehand;

public class Card {
    public static Card valueOf(String rank) {
        return new Card();
    }

    public int points() {
        return 4;
    }
}
