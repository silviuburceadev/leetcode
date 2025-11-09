package com.github.silviuburceadev.leetcode.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MinimumDistanceTriple {

    public int minimumDistance(int[] nums) {
        var result = Integer.MAX_VALUE;

        var indexes = new HashMap<Integer, List<Integer>>();
        for (var i = 0; i < nums.length; i++) {
            indexes.computeIfAbsent(nums[i], _ -> new ArrayList<>()).add(i);
        }

        for (var value : indexes.values()) {
            if (value.size() < 3) continue;
            for (var i = 0; i < value.size() - 2; i++) {
                // for a triple (i, j, k), the distance is:
                // d = abs(i - j) + abs(j - k) + abs(k - i) = j - i + k - j + k - i = 2 * (k - i)
                // so it is enough to look at i and k, where is at least 2 positions to the right
                var left = value.get(i);
                var right = value.get(i + 2);
                result = Math.min(result, 2 * (right - left));
            }
        }

        // no triple found
        if (result == Integer.MAX_VALUE) result = -1;

        return result;
    }
}
