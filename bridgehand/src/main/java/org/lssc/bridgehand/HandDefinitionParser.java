package org.lssc.bridgehand;

import java.util.HashMap;
import java.util.stream.Stream;

public class HandDefinitionParser {
    private final HashMap<Character, Rank> charToRank = new HashMap<Character, Rank>() {
        {
            put('A', Rank.ACE);
            put('K', Rank.KING);
            put('Q', Rank.QUEEN);
            put('J', Rank.JACK);
        }
    };

    public Stream<Card> parseCardsFromDefinition(String handDefinition) {
        return handDefinition.chars()
                    .mapToObj(i -> (char) i)
                    .skip(1)
                    .map(c -> Card.valueOf(charToRank.get(c)));
    }
}
