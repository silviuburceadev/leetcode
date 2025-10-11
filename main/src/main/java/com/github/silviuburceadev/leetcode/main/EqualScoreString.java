package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(3707)
public class EqualScoreString {

    public boolean scoreBalance(String input) {
        final var chars = input.toCharArray();

        int left = 0, right = 0;
        for (int i = 0, j = chars.length - 1; i <= j; ) {
            if (left < right) left += alphaIndex(chars[i++]);
            else right += alphaIndex(chars[j--]);
        }

        return left == right;
    }

    private int alphaIndex(final char c) {
        return c - 'a' + 1;
    }
}
