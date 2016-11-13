package org.lssc.bridgehand;

public class Hand {
    public static Hand from(String handDefinition) {
        return new Hand();
    }

    public Points points() {
        return Points.valueOf(2);
    }
}
