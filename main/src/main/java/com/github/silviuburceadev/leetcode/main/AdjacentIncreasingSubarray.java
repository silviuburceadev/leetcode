package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;
import com.github.silviuburceadev.leetcode.core.model.Range;

import java.util.ArrayList;
import java.util.List;

@Problem(3349)
@Problem(3350)
public class AdjacentIncreasingSubarray {

    @Problem(3349)
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        var ranges = getRanges(nums);
        return maxConsecutiveRangeMinSize(ranges) >= k;
    }

    @Problem(3350)
    public int maxIncreasingSubarrays(List<Integer> nums) {
        var ranges = getRanges(nums);
        return maxConsecutiveRangeMinSize(ranges);
    }

    private int maxConsecutiveRangeMinSize(List<Range> ranges) {
        // tracks the max size of consecutive ranges
        var size = Integer.MIN_VALUE;
        // tracks the max size of a range divided by 2, i.e. a range of size 6 can be treated as 2 ranges of size 3
        var maxSize = ranges.getFirst().size() / 2;

        for (int i = 1; i < ranges.size(); i++) {
            size = Math.max(size, Math.min(ranges.get(i - 1).size(), ranges.get(i).size()));
            maxSize = Math.max(maxSize, ranges.get(i).size() / 2);
        }

        return Math.max(size, maxSize);
    }

    private List<Range> getRanges(List<Integer> nums) {
        var ranges = new ArrayList<Range>();

        var start = 0;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > nums.get(i - 1)) continue;
            ranges.add(new Range(start, i));
            start = i;
        }

        ranges.add(new Range(start, nums.size()));

        return ranges;
    }
}
