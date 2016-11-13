package org.lssc.bridgehand;

import java.util.HashMap;

public class Hand {
    private final String handDefinition;

    HashMap<Character, Rank> charToRank = new HashMap<Character, Rank>() {
        {
            put('A', Rank.ACE);
            put('K', Rank.KING);
            put('Q', Rank.QUEEN);
        }
    };

    public Hand(String handDefinition) {

        this.handDefinition = handDefinition;
    }

    public static Hand from(String handDefinition) {
        return new Hand(handDefinition);
    }

    public Points points() {

        return handDefinition.chars()
                .mapToObj(i -> (char) i)
                .skip(1)
                .map(c -> Card.valueOf(charToRank.get(c)))
                .map(card -> card.points())
                .reduce(Points.valueOf(0), (total, points) -> total.add(points));

    }
}
