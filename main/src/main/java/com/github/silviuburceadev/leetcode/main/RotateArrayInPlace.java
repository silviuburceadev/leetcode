package com.github.silviuburceadev.leetcode.main;

import static com.github.silviuburceadev.leetcode.core.ArrayUtils.reverse;

public class RotateArrayInPlace implements RotateArray {

    @Override
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) return;

        k = k % nums.length;
        if (k == 0) return;

        reverse(nums, 0, nums.length);
        reverse(nums, 0, k);
        reverse(nums, k, nums.length);
    }
}
