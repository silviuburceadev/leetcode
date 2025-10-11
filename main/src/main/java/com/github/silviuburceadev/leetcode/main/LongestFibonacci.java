package com.github.silviuburceadev.leetcode.main;

public class LongestFibonacci {

    public int longestSubarray(int[] nums) {
        int max = 0;

        for (var i = 0; i < nums.length; i++) {
            max = Math.max(max, fibonacciSize(nums, i));
            if (max == nums.length - i) return max;
        }

        return max;
    }

    private int fibonacciSize(int[] nums, int startIndex) {
        if (startIndex == nums.length - 1) return 1;

        int size = 2;
        int prev = nums[startIndex];
        int current = nums[startIndex + 1];

        for (int i = startIndex + 2; i < nums.length; i++) {
            if (nums[i] != prev + current) {
                return size;
            }

            size++;
            prev = current;
            current = nums[i];
        }

        return size;
    }
}
