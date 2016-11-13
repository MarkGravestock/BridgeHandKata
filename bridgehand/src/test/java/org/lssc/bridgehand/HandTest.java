package org.lssc.bridgehand;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

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
                "H???, 0",})

    public void hand_has_expected_point(String handDefinition, int points) {
        Hand sut = Hand.from(handDefinition);

        assertThat(sut.points(), is(equalTo(Points.valueOf(points))));
    }
}
