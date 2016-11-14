package org.lssc.bridgehand.domain;

import java.util.HashMap;

public class RankToPoints {

    private final HashMap<Rank, Points> rankToPoints = new HashMap<Rank, Points>() {
        {
            put(Rank.ACE, Points.valueOf(4));
            put(Rank.KING, Points.valueOf(3));
            put(Rank.QUEEN, Points.valueOf(2));
            put(Rank.JACK, Points.valueOf(1));
        }
    };

    public Points pointsFor(Rank rank) {
        return rankToPoints.getOrDefault(rank, Points.valueOf(0));
    }
}
