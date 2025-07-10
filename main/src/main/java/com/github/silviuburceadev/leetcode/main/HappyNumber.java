package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.HashSet;
import java.util.Set;

/**
 * Problem 202
 */
@Problem(202)
public class HappyNumber {

    private static final Set<Integer> CACHE = new HashSet<>();

    public boolean isHappy(int n) {
        if (n == 1) return true;
        if (!CACHE.add(n)) return false;
        return isHappy(squareDigitSum(n));
    }

    private int squareDigitSum(int n) {
        int sum = 0;
        while (n != 0) {
            final int remainder = n % 10;
            sum += remainder * remainder;
            n /= 10;
        }
        return sum;
    }
}
