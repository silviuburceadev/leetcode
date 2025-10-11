package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.HashSet;

@Problem(3719)
public class LongestBalancedSubarray {

    public int longestBalanced(int[] nums) {
        var max = 0;

        for (var i = 0; i < nums.length - max; i++) {

            var evens = new HashSet<Integer>();
            var odds = new HashSet<Integer>();

            for (var j = i; j < nums.length; j++) {
                var num = nums[j];

                if (num % 2 == 0) evens.add(num);
                else odds.add(num);

                if (odds.size() == evens.size()) {
                    max = Math.max(max, j - i + 1);
                }
            }
        }

        return max;
    }
}
