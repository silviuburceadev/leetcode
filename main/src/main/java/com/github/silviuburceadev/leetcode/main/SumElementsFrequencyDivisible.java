package com.github.silviuburceadev.leetcode.main;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class SumElementsFrequencyDivisible {

    public int sumDivisibleByK(int[] nums, int k) {
        // frequencies
        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()))
                // filtering
                .entrySet().stream()
                .filter(e -> e.getValue() % k == 0)
                // adding
                .mapToInt(e -> e.getKey() * e.getValue().intValue())
                .sum();
    }
}
