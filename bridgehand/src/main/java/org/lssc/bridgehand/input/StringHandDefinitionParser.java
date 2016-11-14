package org.lssc.bridgehand.input;

import org.lssc.bridgehand.domain.Card;
import org.lssc.bridgehand.domain.HandDefinitionParser;
import org.lssc.bridgehand.domain.Rank;

import java.util.HashMap;
import java.util.Iterator;

public class StringHandDefinitionParser implements HandDefinitionParser {

    private final CharacterToRank characterToRank = new CharacterToRank();

    @Override
    public Iterator<Card> parseCardsFrom(String handDefinition) {
        return handDefinition.chars()
                    .mapToObj(characterNumber -> (char) characterNumber)
                    .map(character -> Card.valueOf(characterToRank.rankFor(character)))
                    .iterator();
    }
}
