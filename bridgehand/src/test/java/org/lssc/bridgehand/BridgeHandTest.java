package org.lssc.bridgehand;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class BridgeHandTest {

    @Test
    public void an_ace_has_four_points() {

        Card ace = Card.valueOf("A");

        assertThat(ace.points(), is(equalTo(4)));
    }
}
