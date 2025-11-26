package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

/**
 * Notes:
 * - 111...111 is never divisible by 2 or 5 due to last digit being 1
 * - 10^k - 1 = 999...999 (k - 1 digits of 9s)
 * - (10^k - 1) / 9 = 111...111 (k - 1 digits of 1s)
 * <p>
 * Therefore there is always a <code>x</code>, <code>1 <= x < k</code> for which a number with <code>x</code> digits
 * of 1 will be divisible by k, so the while always ends.
 */
@Problem(1015)
public class SmallestIntegerDivisibleByK {

    public int smallestRepunitDivByK(int k) {
        if (k % 2 == 0 || k % 5 == 0) return -1;

        var remainder = 1 % k;
        var length = 1;
        while (true) {
            if (remainder == 0) return length;

            remainder = (remainder * 10 + 1) % k;
            length++;
        }
    }
}
