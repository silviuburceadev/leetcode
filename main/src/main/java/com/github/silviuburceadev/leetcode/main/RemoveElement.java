package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

/**
 * Problem 27
 */
@Problem(27)
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int different = 0;
        for (var i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == val) {
                if (different > 0) {
                    System.arraycopy(nums, i + 1, nums, i, different);
                }
            } else {
                different++;
            }
        }
        return different;
    }
}
