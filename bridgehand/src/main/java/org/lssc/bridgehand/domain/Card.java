package org.lssc.bridgehand.domain;

import java.util.HashMap;

public class Card {

    private final HashMap<Rank, Points> rankToPoints = new HashMap<Rank, Points>() {
        {
            put(Rank.ACE, Points.valueOf(4));
            put(Rank.KING, Points.valueOf(3));
            put(Rank.QUEEN, Points.valueOf(2));
            put(Rank.JACK, Points.valueOf(1));
        }
    };

    private final Rank rank;

    private Card(Rank rank) {
        this.rank = rank;
    }

    public static Card valueOf(Rank rank) {
        return new Card(rank);
    }

    public Points points() {
        return rankToPoints.getOrDefault(rank, Points.valueOf(0));
    }
}
