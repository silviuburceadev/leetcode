package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(3722)
public class LexicographicallySmallest {

    public String lexSmallest(String s) {
        var chars = s.toCharArray();
        var min = s;

        for (var i = 0; i < chars.length; i++) {
            var reversed = min(reverseLeft(s, i), reverseRight(s, i));
            min = min(min, reversed);
        }

        return min;
    }

    private String min(String left, String right) {
        if (left.compareTo(right) < 0) return left;
        return right;
    }

    private String reverseRight(String s, int i) {
        // reverse right
        return new StringBuilder().append(s, i, s.length()).reverse()
                // prepend left
                .insert(0, s, 0, i).toString();
    }

    private String reverseLeft(String s, int i) {
        // reverse left
        return new StringBuilder(s.substring(0, i)).reverse()
                // append right
                .append(s, i, s.length()).toString();
    }
}
