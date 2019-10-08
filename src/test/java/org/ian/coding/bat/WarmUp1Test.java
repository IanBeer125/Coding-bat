package org.ian.coding.bat;

import org.junit.Before;
import org.junit.Test;

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



}