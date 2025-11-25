package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(1015)
public class SmallestIntegerDivisibleByK {

    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;

        var remainder = 1 % k;
        for (var length = 1; length <= k; length++) {
            if (remainder == 0) return length;
            remainder = (remainder * 10 + 1) % k;
        }

        return -1;
    }
}
