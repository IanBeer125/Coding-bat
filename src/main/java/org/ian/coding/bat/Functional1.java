package org.ian.coding.bat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional1 {
    //Given a list of integers, return a list where each integer is multiplied by 2.
    public List<Integer> doubling(List<Integer> nums) {

        List<Integer> ret = nums.stream().map(i -> i*2).collect(Collectors.toList());

        return ret;
    }

    public List<Integer> square(List<Integer> nums) {

        return nums.stream().map(i -> i*i).collect(Collectors.toList());
    }

    public List<String> addStar(List<String> strings) {

        return null;

    }
}
