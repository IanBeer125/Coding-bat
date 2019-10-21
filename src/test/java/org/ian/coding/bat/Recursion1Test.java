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

    @Test
    public void shouldCount7() throws Exception {
        int num = 717;

        int ret = underTest.count7(num);

        assertThat(ret, is(2));
    }

    @Test
    public void shouldCount8() throws Exception {
        int num = 8818;

        int ret = underTest.count8(num);

        assertThat(ret, is(4));
    }

    @Test
    public void shouldPowerN() throws Exception {
        int base = 3;
        int pow = 3;

        int ret = underTest.powerN(base, pow);

        assertThat(ret, is(27));
    }

    @Test
    public void shouldCountx() throws Exception {
        String string = "xxxbbxx";

        int ret = underTest.countX(string);

        assertThat(ret, is(5));
    }

    @Test
    public void shouldCountHi() throws Exception {
        String str = "xhihixxhi";

        System.out.println(str.substring(1, str.length()));


        int ret = underTest.countHi(str);
        assertThat(ret, is(3));
    }

    @Test
    public void shouldChangeXY() throws Exception {
        String str = "codex";

        String ret = underTest.changeXY(str);

        assertThat(ret, is("codey"));
    }

    @Test
    public void shouldChangePI() throws Exception {
        String str = "xpix";

        String ret = underTest.changePi(str);

        assertThat(ret, is("x3.14x"));
    }

    @Test
    public void shouldNox() throws Exception {
        String str = "xabxx";
        String ret = underTest.noX(str);

        assertThat(ret, is("ab"));
    }

    @Test
    public void shouldArray6() throws Exception {
        int[] ints = new int[]{1,6,4};

        assertTrue(underTest.array6(ints, 0));
    }

    @Test
    public void shouldArray11() throws Exception {
        int[] nums = new int[]{11,11,2,3,4,6};
        int index = 0;

        int ret = underTest.array11(nums, index);

        assertThat(ret, is(2));
    }

    @Test
    public void shouldArray220() throws Exception {
        int[] nums = new int[]{3,2,20,4};

        assertTrue(underTest.array220(nums, 0));

    }


    @Test
    public void shouldAllStar() throws Exception {
        String str = "hello";

        String ret = underTest.allStar(str);

        assertThat(ret, is("h*e*l*l*o"));
    }

    @Test
    public void shouldPairStar() throws Exception {
        String str = "hello";
        String ret = underTest.pairStar(str);

        assertThat(ret, is("hel*lo"));
    }

    @Test
    public void shouldEndX() throws Exception {
        String str = "xerxs";

        String ret = underTest.endX(str);

        assertThat(ret, is("ersxx"));
    }

    @Test
    public void shouldCountABC() throws Exception {
        String str = "abc";

        int ret = underTest.countAbc(str);

        assertThat(ret, is(1));
    }

    @Test
    public void shouldCount11() throws Exception {
        String str = "111";

        int ret = underTest.count11(str);

        assertThat(ret, is(1));

    }
}