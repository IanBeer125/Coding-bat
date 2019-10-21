package org.ian.coding.bat;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class Recursion1Test {
    private Recursion1 underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new Recursion1();
    }

    @Test
    public void shouldFactorial() throws Exception {
        int num = 3;

        int ret = underTest.factorial(num);

        assertThat(ret, is(6));
    }


}