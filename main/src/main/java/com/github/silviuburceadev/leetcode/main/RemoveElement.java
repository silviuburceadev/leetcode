package com.github.silviuburceadev.leetcode.main;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int different = 0;
        for (var i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                System.arraycopy(nums, i + 1, nums, i, nums.length - i);
            } else {
                different++;
            }
        }
        return different;
    }
}
