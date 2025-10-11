package com.github.silviuburceadev.leetcode.main;

import java.util.Arrays;

public class EqualScoreString {

    public boolean scoreBalance(String input) {
        final var chars = input.toCharArray();
        final var sum = new int[chars.length];

        sum[0] = alphaIndex(chars[0]);
        for (var i = 1; i < chars.length; i++) {
            sum[i] = alphaIndex(chars[i]) + sum[i - 1];
        }

        final var total = sum[sum.length - 1];
        if (total % 2 == 1) return false;

        return Arrays.binarySearch(sum, total / 2) >= 0;
    }

    private int alphaIndex(final char c) {
        return c - 'a' + 1;
    }
}
