package com.github.silviuburceadev.leetcode.main;

public class MaximizeExpressionOfThree {

    public int maximizeExpressionOfThree(int[] nums) {
        long max = Long.MIN_VALUE, submax = Long.MIN_VALUE, min = Long.MAX_VALUE;

        for (var num: nums) {
            min = Math.min(min, num);

            if (num >= max) {
                submax = max;
                max = num;
            } else if (num > submax) {
                submax = num;
            }
        }

        return Math.toIntExact(max + submax - min);
    }
}
