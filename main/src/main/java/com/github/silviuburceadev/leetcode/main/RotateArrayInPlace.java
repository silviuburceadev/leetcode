package com.github.silviuburceadev.leetcode.main;

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

    /**
     * Swaps elements in the given array between start (inclusive) and end (exclusive)
     * @param nums  the given array
     * @param start the starting index (inclusive)
     * @param end   the ending index (exclusive)
     */
    private void reverse(int[] nums, int start, int end) {
        while (start < --end) {
            swap(nums, start++, end);
        }
    }

    /**
     * Swaps the elements in a given for the specified indexes
     * @param nums  the given array
     * @param left  the index of left element
     * @param right the index of right element
     */
    private void swap(int[] nums, int left, int right) {
        nums[left] = nums[left] + nums[right];
        nums[right] = nums[left] - nums[right];
        nums[left] = nums[left] - nums[right];
    }
}
