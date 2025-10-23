package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(2348)
public class ZeroFilledSubarrays {

    public long zeroFilledSubarray(int[] nums) {
        var current = 0;
        var total = 0L;

        for (int num : nums) {
            if (num == 0) {
                current++;
            } else {
                total += subarrays(current);
                current = 0;
            }
        }

        // add the tail, if it ends with 0s
        total += subarrays(current);

        return total;
    }

    private long subarrays(int length) {
        return (long) length * (length + 1) / 2;
    }
}
