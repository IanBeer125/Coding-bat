package org.ian.coding.bat;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Functional1Test {
    private Functional1 underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new Functional1();
    }

    @Test
    public void shouldDoubling() throws Exception {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        List<Integer> ret = underTest.doubling(nums);

        assertThat(ret.get(0), is(2));
        assertThat(ret.get(1), is(4));
        assertThat(ret.get(2), is(6));


    }

    @Test
    public void shouldSquare() throws Exception {
        List<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(4);
        nums.add(6);

        List<Integer> ret = underTest.square(nums);

        assertThat(nums.get(0), is(4));
        assertThat(nums.get(1), is(16));
        assertThat(nums.get(2), is(36));
    }

}