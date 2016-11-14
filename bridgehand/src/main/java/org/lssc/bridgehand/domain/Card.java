package org.lssc.bridgehand.domain;

public class Card {

    private final RankToPoints rankToPoints = new RankToPoints();
    private final Rank rank;

    private Card(Rank rank) {
        this.rank = rank;
    }

    public static Card valueOf(Rank rank) {
        return new Card(rank);
    }

    public Points points() {
        return rankToPoints.pointsFor(rank);
    }

}
