package org.lssc.bridgehand;

import java.util.stream.Stream;

public class Hand {
    private final HandDefinitionParser handDefinitionParser = new HandDefinitionParser();
    private final String handDefinition;

    public Hand(String handDefinition) {

        this.handDefinition = handDefinition;
    }

    public static Hand from(String handDefinition) {
        return new Hand(handDefinition);
    }

    public Points points() {

        Stream<Card> cardStream = handDefinitionParser.parseCardsFromDefinition(handDefinition);

        Points handPoints = calculateTotalPointsFrom(cardStream);

        return handPoints;
    }

    private Points calculateTotalPointsFrom(Stream<Card> cardStream) {
        return cardStream
                .map(card -> card.points())
                .reduce(Points.valueOf(0), (total, points) -> total.add(points));
    }
}
