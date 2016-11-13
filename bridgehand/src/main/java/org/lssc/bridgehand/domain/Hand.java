package org.lssc.bridgehand.domain;

import java.util.Iterator;
import java.util.stream.StreamSupport;

public class Hand {
    private final HandDefinitionParser handDefinitionParser;
    private final String handDefinition;

    private Hand(String handDefinition, HandDefinitionParser handDefinitionParser) {
        this.handDefinition = handDefinition;
        this.handDefinitionParser = handDefinitionParser;
    }

    public static HandDefinitionParserExpression from(String handDefinition) {
        return new HandDefinitionParserExpression(handDefinition);
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

    public static class HandDefinitionParserExpression {

        private final String handDefinition;

        public HandDefinitionParserExpression(String handDefinition) {
            this.handDefinition = handDefinition;
        }

        public Hand using(HandDefinitionParser handDefinitionParser) {
            return new Hand(handDefinition, handDefinitionParser);
        }
    }
}
