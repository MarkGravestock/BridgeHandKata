package org.lssc.bridgehand.input;

import org.lssc.bridgehand.domain.Card;
import org.lssc.bridgehand.domain.HandDefinitionParser;
import org.lssc.bridgehand.domain.Rank;

import java.util.HashMap;
import java.util.Iterator;

public class StringHandDefinitionParser implements HandDefinitionParser {
    private final HashMap<Character, Rank> charToRank = new HashMap<Character, Rank>() {
        {
            put('A', Rank.ACE);
            put('K', Rank.KING);
            put('Q', Rank.QUEEN);
            put('J', Rank.JACK);
        }
    };

    @Override
    public Iterator<Card> parseCardsFrom(String handDefinition) {
        return handDefinition.chars()
                    .mapToObj(characterNumber -> (char) characterNumber)
                    .skip(1)
                    .map(character -> Card.valueOf(charToRank.get(character)))
                    .iterator();
    }
}
