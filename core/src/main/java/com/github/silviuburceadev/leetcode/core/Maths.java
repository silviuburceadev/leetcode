package com.github.silviuburceadev.leetcode.core;

public final class Maths {

    public static int numberOfBits(int n) {
        // ln(0) is not defined
        if (n == 0) return 1;
        return 1 + (int)(Math.log(n) / Math.log(2));
    }
}
