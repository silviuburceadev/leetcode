package com.github.silviuburceadev.leetcode.main;

public class MinimumOperations {

    public long minOperations(int[] nums1, int[] nums2) {
        var target = nums2[nums2.length - 1];
        var minOps = Integer.MAX_VALUE;
        var total = 0L;

        for (var i = 0; i < nums1.length; i++) {
            total += Math.abs(nums1[i] - nums2[i]);

            if (between(target, nums1[i], nums2[i])) {
                // nums1[i] will migrate to nums2[i] and will be equal to target, which gets added and no further
                // actions are needed (apart from addition itself, counted at the end)
                minOps = 0;
            } else if (minOps != 0) {
                minOps = Math.min(minOps, Math.abs(nums1[i] - target));
                minOps = Math.min(minOps, Math.abs(nums2[i] - target));
            }
        }

        // don't forget to add 1 for addition itself
        return total + minOps + 1;
    }

    private boolean between(int n, int left, int right) {
        return Math.min(left, right) <= n && n <= Math.max(left, right);
    }
}
