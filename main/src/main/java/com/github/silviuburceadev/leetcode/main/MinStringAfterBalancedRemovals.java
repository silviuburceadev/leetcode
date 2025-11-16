package com.github.silviuburceadev.leetcode.main;

public class MinStringAfterBalancedRemovals {

    public int minLengthAfterRemovals(String s) {
        var count = 0;

        for (var c : s.toCharArray()) {
            count += c == 'a' ? 1 : -1;
        }

        return Math.abs(count);
    }
}
