package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Problem(3712)
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
