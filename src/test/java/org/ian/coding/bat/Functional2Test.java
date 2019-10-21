package org.ian.coding.bat;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
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

    @Test
    public void shouldNo9() throws Exception {
        List<Integer> nums = List.of(9, 11, 19, 29, 23);

        List<Integer> ret = underTest.no9(nums);

        assertThat(ret.size(), is(2));
    }

    @Test
    public void shouldNoTeen() throws Exception {
        List<Integer> nums = List.of(1,12,14,17, 20, 21);

        List<Integer> ret = underTest.noTeen(nums);

        assertThat(ret.size(), is(4));
    }

    @Test
    public void shouldNoz() throws Exception {
        List<String> strings = new ArrayList();
        strings.add("aaa");
        strings.add("bbb");
        strings.add("aze");

        List<String> ret = underTest.noZ(strings);

        assertThat(ret.size(), is(2));
    }

    @Test
    public void shouldNoLong() throws Exception {
        List<String> strings = new ArrayList();
        strings.add("aaaa");
        strings.add("bbb");
        strings.add("azea");

        List<String> ret = underTest.noLong(strings);

        assertThat(ret.size(), is(1));
    }

    @Test
    public void shouldNo34() throws Exception {
        List<String> strings = new ArrayList();
        strings.add("aaaa");
        strings.add("bbb");
        strings.add("az");
        strings.add("a");
        strings.add("apple");

        List<String> ret = underTest.no34(strings);

        assertThat(ret.size()  , is(3));
    }
    
    @Test
    public void shouldNoYY() throws Exception {
        List<String> strings = new ArrayList();
        strings.add("aaaa");
        strings.add("bbby");
        strings.add("yaz");

        List<String> ret = underTest.noYY(strings);

        assertThat(ret.size(), is(2));
        assertThat(ret.get(0), is("aaay"));

        assertThat(ret.get(3), is("yazy"));

    }


}