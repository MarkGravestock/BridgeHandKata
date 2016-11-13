package org.lssc.bridgehand;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class PointsTest {
    @Test
    public void two_points_are_equal_when_they_have_the_same_point_value() throws Exception {
        assertThat(Points.valueOf(3), is(equalTo(Points.valueOf(3))));
    }

    @Test
    public void two_points_are_not_equal_when_they_have_different_point_values() throws Exception {
        assertThat(Points.valueOf(3), is(not(equalTo(Points.valueOf(4)))));
    }

    @Test
    public void both_classes_must_be_points_to_be_equal() throws Exception {
        assertThat("hello", is(not(equalTo(Points.valueOf(3)))));
    }

    @Test
    public void two_points_with_same_values_have_the_same_hash_code() {
        assertThat(Points.valueOf(3).hashCode(), is(equalTo(Points.valueOf(3).hashCode())));
    }

    @Test
    public void the_to_string_provides_diagnostic_informaation_for_assertions() {
        assertThat(Points.valueOf(2).toString(), is(equalTo("Points[value=2]")));
    }
}