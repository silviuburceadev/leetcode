package com.github.silviuburceadev.leetcode.main;

import java.util.ArrayList;

public class LongestNonDecreasingSubarrayReplacement {

    record Range(int start, int end) {
        public int size() {
            return end - start + 1;
        }
    }

    public int longestSubarray(int[] nums) {
        if (nums.length < 3) return nums.length;

        var ranges = new ArrayList<Range>();

        var start = 0;
        for (var i = 1; i < nums.length; i++) {
            if (nums[i - 1] <= nums[i]) continue;
            ranges.add(new Range(start, i - 1));
            start = i;
        }
        ranges.add(new Range(start, nums.length - 1));

        var result = ranges.getFirst().size() + 1;
        for (var i = 1; i < ranges.size(); i++) {
            result = Math.max(result, ranges.get(i).size() + 1);
            if (canLink(nums, ranges.get(i - 1), ranges.get(i))) {
                result = Math.max(result, ranges.get(i - 1).size() + ranges.get(i).size());
            }
        }

        result = Math.min(result, nums.length);

        return result;
    }

    private boolean canLink(int[] nums, Range left, Range right) {
        if (left.size() == 1 || right.size() == 1) return true;
        return nums[left.end - 1] <= nums[right.start] || nums[left.end] <= nums[right.start + 1];
    }
}
