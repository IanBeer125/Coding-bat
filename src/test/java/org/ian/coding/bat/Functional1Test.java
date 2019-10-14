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

        assertThat(ret.get(0), is(4));
        assertThat(ret.get(1), is(16));
        assertThat(ret.get(2), is(36));
    }

    @Test
    public void shouldAddStar() throws Exception {
        List<String> strings = new ArrayList<>();
        strings.add("add");
        strings.add("star");

        List<String> ret = underTest.addStar(strings);

        assertThat(ret.get(0), is("add*"));
        assertThat(ret.get(1), is("star*"));
    }

    @Test
    public void shouldCopies3() throws Exception {
        List<String> strings = List.of("aa","bb","cc");

        List<String> ret = underTest.copies3(strings);

        assertThat(ret.get(0), is("aaaaaa"));
        assertThat(ret.get(1), is("bbbbbb"));
        assertThat(ret.get(2), is("cccccc"));
    }

    @Test
    public void shouldMoreY() throws Exception {
        List<String> strings = List.of("a","b","c");

        List<String> ret = underTest.moreY(strings);

        assertThat(ret.get(0), is("yay"));
        assertThat(ret.get(1), is("yby"));
        assertThat(ret.get(2), is("ycy"));
    }

}