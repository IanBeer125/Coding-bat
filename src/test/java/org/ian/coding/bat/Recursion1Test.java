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

    @Test
    public void shouldBunnyEars() throws Exception {
        int num = 3;
        int ret = underTest.bunnyEars(num);

        assertThat(ret, is(6));
    }

    @Test
    public void shouldFibonacci() throws Exception {
        int num = 3;

        int ret = underTest.fibonacci(num);

        assertThat(ret, is(2));
    }
    
    @Test
    public void shouldbunnyEars2() throws Exception {
        int num = 2;
        
        int ret = underTest.bunnyEars2(num);
        
        assertThat(ret, is(5));
    }

    @Test
    public void shouldTriangle() throws Exception {
        int num = 3;
        int ret = underTest.triangle(num);

        assertThat(ret, is(6));
    }

    @Test
    public void shouldSumDigits() throws Exception {
        int num = 126;
        int ret = underTest.sumDigits(num);

        assertThat(ret, is(9));
    }
}