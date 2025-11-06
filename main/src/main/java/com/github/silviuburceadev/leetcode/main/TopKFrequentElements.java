package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;
import com.github.silviuburceadev.leetcode.core.meta.Revisit;

import java.util.Arrays;
import java.util.Map;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Problem(347)
@Revisit("Bucket sort the frequency")
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {
        return Arrays.stream(nums)
                .boxed()
                .collect(groupingBy(x -> x, counting()))
                .entrySet()
                .stream()
                .sorted((Map.Entry.<Integer, Long>comparingByValue().reversed()))
                .limit(k)
                .mapToInt(Map.Entry::getKey)
                .toArray();
    }
}
