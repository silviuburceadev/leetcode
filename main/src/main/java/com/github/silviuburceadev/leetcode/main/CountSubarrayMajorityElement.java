package com.github.silviuburceadev.leetcode.main;

public class CountSubarrayMajorityElement {

    public int countMajoritySubarrays(int[] nums, int target) {
        var total = 0;
        for (var i = 0; i < nums.length; i++) {
            var hit = 0;
            for (var j = i; j < nums.length; j++) {
                if (nums[j] == target) {
                    hit++;
                }
                if (2 * hit > j - i + 1) {
                    total++;
                }
            }
        }

        return total;
    }
}
