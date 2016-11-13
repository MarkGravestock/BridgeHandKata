package org.lssc.bridgehand.domain;

import java.util.Iterator;

public interface HandDefinitionParser {
    Iterator<Card> parseCardsFrom(String handDefinition);
}
