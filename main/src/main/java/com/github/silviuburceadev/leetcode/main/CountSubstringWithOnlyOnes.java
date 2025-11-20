package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(1513)
public class CountSubstringWithOnlyOnes {

    public int numSub(String s) {
        var total = 0L;
        var sequence = 0L;

        // instead of using n * (n + 1) / 2, use the fact that the sum is 1 + 2 + 3 + ... + n, so add each term
        for (char c: s.toCharArray()) {
            if (c == '1') {
                sequence++;
                total += sequence;
            } else {
                sequence = 0L;
            }
        }

        return Math.toIntExact(total % 1_000_000_007);
    }
}
