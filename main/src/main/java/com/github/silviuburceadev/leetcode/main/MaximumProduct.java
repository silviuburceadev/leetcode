package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

@Problem(-1)
public class MaximumProduct {
    public static final long MAX = 100_000L;

    public long maxProduct(int[] nums) {
        var sorted = Arrays.stream(nums).boxed().sorted().collect(Collectors.toCollection(ArrayList::new));
        var first = sorted.getFirst();
        var last = sorted.getLast();

        // all are negative, need to select first 2
        if (last <= 0) return MAX * first * sorted.get(1);

        // all are positive, need to select last 2
        if (first >= 0) return MAX * sorted.get(sorted.size() - 2) * last;

        // first is negative, last is positive, so we either pick:
        // first 2, last 2 or first and last
        var result = Math.max((long)first * sorted.get(1), (long)sorted.get(sorted.size() - 2) * last);
        result = Math.max(result, (long) -first * last);
        return MAX * result;
    }
}
