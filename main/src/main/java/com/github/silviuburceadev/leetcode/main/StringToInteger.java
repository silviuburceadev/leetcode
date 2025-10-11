package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(8)
public class StringToInteger {

    public int myAtoi(String s) {
        var chars = s.trim().toCharArray();
        if (chars.length == 0) return 0;
        var res = 0L;
        var sign = 1;
        var start = 0;
        if (chars[0] == '-') {
            sign = -1;
            start = 1;
        }
        if (chars[0] == '+') {
            start = 1;
        }

        for (var i = start; i < chars.length && Character.isDigit(chars[i]); i++) {
            res = res * 10 + sign * Character.digit(chars[i], 10);
            if (res < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
            if (res > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
        }

        return (int) res;
    }
}
