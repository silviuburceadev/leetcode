package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(747)
public class LargestNumberTwice {

    /**
     * Returns the index for the dominant element (i.e. at least twice as big as rest of the elements).
     * If no such element exists, <code>-1</code> is returned.
     *
     * @param nums the array of numbers
     * @return the index of dominant number, if found, -1 otherwise
     */
    public int dominantIndex(int[] nums) {
        if (nums.length < 2) return -1;

        var maxIndex = maxIndex(nums, -1);
        var max = nums[maxIndex];

        var nextIndex = maxIndex(nums, maxIndex);
        var next = nums[nextIndex];

        return max >= next * 2 ? maxIndex : -1;
    }

    /**
     * Finds the index for the maximum element, excluding the given index.
     *
     * @param nums        the array of numbers
     * @param exceptIndex the index to be excluded
     * @return the index for the maximum element
     */
    private int maxIndex(int[] nums, int exceptIndex) {
        // starting index for the max, start at 0 unless that is the excluded index
        var maxIndex = exceptIndex == 0 ? 1 : 0;

        for (var i = 1; i < nums.length; i++) {
            if (i == exceptIndex) continue;

            var num = nums[i];
            if (nums[maxIndex] < num) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
