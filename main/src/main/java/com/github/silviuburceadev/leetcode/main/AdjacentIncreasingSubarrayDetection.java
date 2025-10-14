package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.List;

@Problem(3349)
public class AdjacentIncreasingSubarrayDetection {

    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        var sizes = increasingSubarraySizes(nums);
        return detectAdjacent(sizes, k);
    }

    /**
     * Detects if there are 2 adjacent subarrays of size <code>k</code> by checking the increasing subarray's size
     * at index <code>i</code> and <code>i + k</code> and verify that both are at least <code>k</code> long.
     * @param sizes the sizes of increasing subarrays
     * @param k     the required size
     * @return      true if such adjacent subarrays exist, false otherwise
     */
    private boolean detectAdjacent(int[] sizes, int k) {
        for (var i = k - 1; i < sizes.length - k; i++) {
            if (sizes[i] >= k && sizes[i + k] >= k) {
                return true;
            }
        }

        return false;
    }

    /**
     * Builds an array with the increasing subarray's size at <code>i-th</code> index.
     * @param nums  the given numbers
     * @return      the array of increasing subarray's size
     */
    private static int[] increasingSubarraySizes(List<Integer> nums) {
        var size = new int[nums.size()];
        // first element is considered an increasing subarray
        size[0] = 1;

        for (var i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) {
                size[i] = size[i - 1] + 1;
            } else {
                size[i] = 1;
            }
        }

        return size;
    }
}
