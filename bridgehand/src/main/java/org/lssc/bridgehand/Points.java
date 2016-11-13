package org.lssc.bridgehand;

import org.apache.commons.lang3.builder.EqualsBuilder;

public class Points {
    private final int points;

    public Points(int points) {

        this.points = points;
    }

    public static Points valueOf(int points) {
        return new Points(points);
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj);
    }
}
