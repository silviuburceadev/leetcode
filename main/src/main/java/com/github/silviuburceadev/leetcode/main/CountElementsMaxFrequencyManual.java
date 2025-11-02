package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Arrays;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Problem(3005)
public class CountElementsMaxFrequencyManual implements CountElementsMaxFrequency {

    @Override
    public int maxFrequencyElements(int[] nums) {
        // compute frequencies
        var frequencies = Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(identity(), counting()));

        // find maximum frequency
        int max = frequencies.values().stream().mapToInt(Long::intValue).max().orElseThrow();
        // find how many DISTINCT numbers have it
        int count = (int) frequencies.values().stream().filter(frequency -> frequency == max).count();
        // find how many TOTAL numbers have the maximum frequency
        return max * count;
    }
}
