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

        return strings.stream().map(s -> s+"*").collect(Collectors.toList());

    }

    public List<String> copies3(List<String> strings) {
        return strings.stream().map(s -> s+s+s).collect(Collectors.toList());
    }

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(s -> "y"+s+"y").collect(Collectors.toList());
    }

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(i -> i + 1).map(i -> i * 10).collect(Collectors.toList());
    }

    public List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(i -> i % 10).collect(Collectors.toList());
    }

    public List<String> lower(List<String> strings) {
        return strings.stream().map(s -> s.toLowerCase()).collect(Collectors.toList());
    }

    public List<String> noX(List<String> strings) {

    }
}
