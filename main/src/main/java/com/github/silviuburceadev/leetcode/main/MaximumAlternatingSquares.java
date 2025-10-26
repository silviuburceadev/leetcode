package com.github.silviuburceadev.leetcode.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class MaximumAlternatingSquares {

    public long maxAlternatingSum(int[] nums) {
        var sorted = Arrays.stream(nums).boxed()
                .sorted(Comparator.comparingInt(Math::abs))
                .collect(Collectors.toCollection(ArrayList::new));

        var sum = 0L;
        var half = sorted.size() / 2;
        for (var i = 0; i < half; i++) {
            sum -= (long) sorted.get(i) * sorted.get(i);
            sum += (long) sorted.get(i + half) * sorted.get(i + half);
        }

        if (sorted.size() % 2 == 1) sum += (long) sorted.getLast() * sorted.getLast();

        return sum;
    }
}
