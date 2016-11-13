package org.lssc.bridgehand.domain;

import org.lssc.bridgehand.input.StringHandDefinitionParser;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Hand {
    private final HandDefinitionParser handDefinitionParser = new StringHandDefinitionParser();
    private final String handDefinition;

    private Hand(String handDefinition) {
        this.handDefinition = handDefinition;
    }

    public static Hand from(String handDefinition) {
        return new Hand(handDefinition);
    }

    public Points points() {
        Iterator<Card> cardStream = handDefinitionParser.parseCardsFrom(handDefinition);

        return calculateTotalPointsFrom(cardStream);
    }

    private Points calculateTotalPointsFrom(Iterator<Card> cards) {
        return StreamSupport.stream(((Iterable<Card>) () -> cards).spliterator(), false)
                .map(Card::points)
                .reduce(Points.valueOf(0), Points::add);
    }
}
