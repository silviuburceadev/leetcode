package com.github.silviuburceadev.leetcode.core;

public final class Maths {

    public static int numberOfBits(int n) {
        return 1 + (int)(Math.log(n) / Math.log(2));
    }
}
