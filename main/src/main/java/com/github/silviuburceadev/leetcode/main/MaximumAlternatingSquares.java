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
        var fromEnd = true;

        while (!sorted.isEmpty()) {
            if (fromEnd) {
                long n = sorted.removeLast();
                sum += n * n;
            } else {
                long n = sorted.removeFirst();
                sum -= n * n;
            }
            fromEnd = !fromEnd;
        }

        return sum;
    }
}
