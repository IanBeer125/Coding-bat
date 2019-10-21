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
        return nums.stream().filter(i -> i < 13 || i >19)
                .collect(Collectors.toList());
    }

    public List<String> noZ(List<String> strings) {
        strings.removeIf(s -> s.contains("z"));
        return strings;
    }

    public List<String> noLong(List<String> strings) {
        strings.removeIf(s -> s.length() >=4);
        return strings;
    }

    public List<String> no34(List<String> strings) {
        return strings.stream().filter(s -> s.length() != 3 && s.length() !=4).collect(Collectors.toList());
    }

    public List<String> noYY(List<String> strings) {
        return strings.stream().map(s -> s.concat("y"))
                .filter(s -> !s.contains("yy"))
                .collect(Collectors.toList());
    }

    public List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(i -> i*2)
                .filter(i -> i % 10 != 2)
                .collect(Collectors.toList());
    }

    public List<Integer> square56(List<Integer> nums) {
        nums.replaceAll(i -> (int) Math.pow(i, 2) + 10);
        return nums.stream()
                .filter(i -> i % 10 != 5 && i % 10 !=6)
                .collect(Collectors.toList());
    }
}
