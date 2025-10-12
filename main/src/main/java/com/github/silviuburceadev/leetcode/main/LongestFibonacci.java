package com.github.silviuburceadev.leetcode.main;

public class LongestFibonacci {

    public int longestSubarray(int[] nums) {
        int max = 1;

        for (var i = 0; i < nums.length - 1; i++) {
            max = Math.max(max, fibonacciSize(nums, i));
            if (max == nums.length - i) break;
        }

        return max;
    }

    private int fibonacciSize(int[] nums, int startIndex) {
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
