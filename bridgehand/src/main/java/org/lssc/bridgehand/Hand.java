package org.lssc.bridgehand;

public class Hand {
    private final String handDefinition;

    public Hand(String handDefinition) {

        this.handDefinition = handDefinition;
    }

    public static Hand from(String handDefinition) {
        return new Hand(handDefinition);
    }

    public Points points() {
        if (handDefinition.equals("SQ")) {
            return Points.valueOf(2);
        }

        if (handDefinition.equals("SKQ")) {
            return Points.valueOf(3);
        }

        return Points.valueOf(3);
    }
}
