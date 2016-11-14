package org.lssc.bridgehand.input;

import org.lssc.bridgehand.domain.Rank;

import java.util.HashMap;

public class CharacterToRank {
    private final HashMap<Character, Rank> characterToRank = new HashMap<Character, Rank>() {
        {
            put('A', Rank.ACE);
            put('K', Rank.KING);
            put('Q', Rank.QUEEN);
            put('J', Rank.JACK);
        }
    };

    public Rank rankFor(Character character) {
        return characterToRank.get(character);
    }
}
