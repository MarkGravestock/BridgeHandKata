package org.lssc.bridgehand;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class CardTest {

    @Test
    public void an_ace_is_worth_4_points() {
        Card ace = Card.valueOf(Rank.ACE);

        assertThat(ace.points(), is(equalTo(Points.valueOf(4))));
    }

    @Test
    public void a_king_is_worth_3_points() {
        Card king = Card.valueOf(Rank.KING);

        assertThat(king.points(), is(equalTo(Points.valueOf(3))));
    }

    @Test
    public void a_queen_is_worth_2_points() {
        Card queen = Card.valueOf(Rank.QUEEN);

        assertThat(queen.points(), is(equalTo(Points.valueOf(2))));
    }
}
