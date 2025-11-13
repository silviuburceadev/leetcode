package com.github.silviuburceadev.leetcode.core;

public final class ArrayUtils {

    private ArrayUtils() {
        // Utility class
    }

    /**
     * Reverses the given array.
     *
     * @param nums the given array
     */
    public static void reverse(int[] nums) {
        reverse(nums, 0, nums.length);
    }

    /**
     * Swaps elements in the given array between start (inclusive) and end (exclusive)
     *
     * @param nums  the given array
     * @param start the starting index (inclusive)
     * @param end   the ending index (exclusive)
     */
    public static void reverse(int[] nums, int start, int end) {
        while (start < --end) {
            swap(nums, start++, end);
        }
    }

    /**
     * Swaps the elements in a given for the specified indexes
     *
     * @param nums  the given array
     * @param left  the index of left element
     * @param right the index of right element
     */
    private static void swap(int[] nums, int left, int right) {
        nums[left] = nums[left] + nums[right];
        nums[right] = nums[left] - nums[right];
        nums[left] = nums[left] - nums[right];
    }
}
