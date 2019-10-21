package org.ian.coding.bat;

import java.util.List;
import java.util.stream.Collectors;

public class Functional2 {

    public List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(i -> i >=0).collect(Collectors.toList());
    }

    public List<Integer> no9(List<Integer> nums) {
        return nums.stream().filter(i -> i % 10 != 9).collect(Collectors.toList());
    }

    public List<Integer> noTeen(List<Integer> nums) {

    }
}
