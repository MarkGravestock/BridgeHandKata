package org.lssc.bridgehand;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HandTest {
    @Test
    public void a_hand_with_one_card_has_correct_points() throws Exception {
        Hand sut = Hand.from("SQ");

        assertThat(sut.points(), is(equalTo(Points.valueOf(2))));
    }

    @Test
    public void a_hand_with_two_cards_has_expected_points() throws Exception {
        Hand sut = Hand.from("SKQ");

        assertThat(sut.points(), is(equalTo(Points.valueOf(3))));
    }

    @Test
    public void a_hand_with_three_cards_has_expected_points() throws Exception {
        Hand sut = Hand.from("SAKQ");

        assertThat(sut.points(), is(equalTo(Points.valueOf(6))));
    }
}
