package org.lssc.bridgehand.domain;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lssc.bridgehand.domain.Hand;
import org.lssc.bridgehand.domain.Points;
import org.lssc.bridgehand.input.StringHandDefinitionParser;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(JUnitParamsRunner.class)
public class HandTest {

    @Test
    @Parameters({"SQ, 2",
                "SKQ, 5",
                "SAKQ, 9",
                "CAKQJ, 10",
                "S????, 0",
                "H???, 0",
                "SAKQ\nCAKQJ, 19",
                "SAKQ\nHAKQ\nDAKQ\nCAKQJ, 37"})
    public void hand_has_expected_point(String handDefinition, int points) {
        Hand sut = Hand.from(handDefinition).using(new StringHandDefinitionParser());

        assertThat(sut.points(), is(equalTo(Points.valueOf(points))));
    }
}
