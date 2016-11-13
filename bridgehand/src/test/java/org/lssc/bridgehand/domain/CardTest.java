package org.lssc.bridgehand.domain;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.lssc.bridgehand.domain.Card;
import org.lssc.bridgehand.domain.Points;
import org.lssc.bridgehand.domain.Rank;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class CardTest {

    @Test
    @Parameters({"ACE, 4", "KING, 3", "QUEEN, 2", "JACK, 1" , "NUMBER, 0"})
    public void card_has_expected_points_for_rank(Rank rank, int points) {
        Card ace = Card.valueOf(rank);

        assertThat(ace.points(), is(equalTo(Points.valueOf(points))));
    }
}
