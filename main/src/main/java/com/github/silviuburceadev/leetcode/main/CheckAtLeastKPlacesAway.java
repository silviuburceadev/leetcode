package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(1437)
public class CheckAtLeastKPlacesAway {

    /**
     * Checks if there are at least k numbers (distance) between 1s.
     * @param nums  the given numbers
     * @param k     the given distance
     * @return      true if there is enough space between 1s, false otherwise
     */
    public boolean kLengthApart(int[] nums, int k) {
        return kLengthApart(nums, 1, k);
    }

    /**
     * Checks if there are at least k numbers between elements with a fixed value.
     *
     * @param nums the numbers array
     * @param val  the given value to check the distance between
     * @param k    the given distance
     * @return true if there is enough space between the chosen elements, false otherwise
     */
    public boolean kLengthApart(int[] nums, int val, int k) {
        // use a prevIndex that could match first val that matches in the array
        var prevIndex = -k - 1;
        for (var i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != val) continue;
            if (i - prevIndex - 1 < k) return false;
            prevIndex = i;
        }

        return true;
    }
}
