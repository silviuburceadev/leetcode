package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingLong;

@Problem(3005)
public class CountElementsMaxFrequencyStream implements CountElementsMaxFrequency {

    @Override
    public int maxFrequencyElements(int[] nums) {
        // frequencies
        return Arrays.stream(nums)
                .boxed()
                // count how many numbers have
                .collect(groupingBy(identity(), counting()))
                .entrySet()
                .stream()
                .collect(groupingBy(
                        Map.Entry::getValue,
                        TreeMap::new,
                        summingLong(Map.Entry::getValue))
                )
                .lastEntry()
                .getValue()
                .intValue();
    }
}
