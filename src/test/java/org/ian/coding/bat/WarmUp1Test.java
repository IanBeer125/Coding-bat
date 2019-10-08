package org.ian.coding.bat;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class WarmUp1Test {
    private WarmUp1 underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new WarmUp1();
    }

    @Test
    public void shouldSleepinVacation() throws Exception {
        assertTrue(underTest.sleepIn(true, true));
    }

    @Test
    public void shouldSleepinWeekend() throws Exception {
        assertTrue(underTest.sleepIn(false, false));
    }

    @Test
    public void shouldNotSleepinWeekdayNoVacation() throws Exception {
        assertFalse(underTest.sleepIn(true, false));
    }

    @Test
    public void shouldMonkeyTrouble2Smiles() throws Exception {
        assertTrue(underTest.monkeyTrouble(true, true));
    }

    @Test
    public void shouldMonkeyTrouble2Sad() throws Exception {
        assertTrue(underTest.monkeyTrouble(false, false));
    }
    @Test
    public void shouldNotonkeyTrouble1Smile() throws Exception {
        assertFalse(underTest.monkeyTrouble(true, false));
    }

    @Test
    public void shouldSumDoubleDouble() throws Exception {
        assertThat(underTest.sumDouble(2,2), is(8));
    }
    @Test
    public void shouldSumDoubleSum() throws Exception {
        assertThat(underTest.sumDouble(1,2), is(3));
    }
    @Test
    public void shouldSumDoubleSum2() throws Exception {
        assertThat(underTest.sumDouble(3,2), is(5));
    }


}