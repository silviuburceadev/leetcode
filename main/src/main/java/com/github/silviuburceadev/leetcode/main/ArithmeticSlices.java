package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(413)
public class ArithmeticSlices {

    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3) return 0;

        var result = 0;
        var streak = 2;
        for (var i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) streak++;
            else {
                result += slices(streak);
                streak = 2;
            }
        }

        // if array ends with a streak, add it
        result += slices(streak);

        return result;
    }

    private int slices(int streak) {
        return (streak - 1) * (streak - 2) / 2;
    }
}
