package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Arrays;

@Problem(3718)
public class SmallestMissingMultiple {

    public int missingMultiple(int[] nums, int k) {
        var filtered = Arrays.stream(nums).filter(n -> n > 0 && n % k == 0).distinct().sorted().toArray();
        if (filtered.length == 0) return k;

        for (var i = 0; i < filtered.length; i++) {
            var toMatch = (i + 1) * k;
            if (filtered[i] != toMatch) {
                return toMatch;
            }
        }

        return filtered[filtered.length - 1] + k;
    }
}
