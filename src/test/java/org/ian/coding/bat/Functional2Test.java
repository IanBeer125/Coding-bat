package org.ian.coding.bat;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Functional2Test {
    private Functional2 underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new Functional2();
    }

    @Test
    public void shouldNoNeg() throws Exception {
        List<Integer> nums = List.of(-1, 0, 2, 3);

        List<Integer> ret = underTest.noNeg(nums);

        assertThat(ret.size(), is(3));
    }


}