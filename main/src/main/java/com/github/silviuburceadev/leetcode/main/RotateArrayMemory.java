package com.github.silviuburceadev.leetcode.main;

public class RotateArrayMemory implements RotateArray {

    @Override
    public void rotate(int[] nums, int k) {
        if (nums.length < 2) return;

        k = k % nums.length;
        if (k == 0) return;

        var temp = new int[Math.max(k, nums.length - k)];
        System.arraycopy(nums, 0, temp, 0, nums.length - k);
        System.arraycopy(nums, nums.length - k, nums, 0, k);
        System.arraycopy(temp, 0, nums, k, nums.length - k);
    }
}
