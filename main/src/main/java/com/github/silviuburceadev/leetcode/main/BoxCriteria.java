package com.github.silviuburceadev.leetcode.main;

public class BoxCriteria {
    private static final long LARGE = 1_000_000_000;
    private static final int WIDE = 10_000;
    private static final int HEAVY = 100;

    public String categorizeBox(int length, int width, int height, int mass) {
        var isLarge = isLarge(length, width, height);
        var isWide = isWide(length, width, height);
        var isBulky = isLarge || isWide;
        var isHeavy = mass >= HEAVY;

        if (isBulky && isHeavy) return "Both";
        if (isBulky) return "Bulky";
        if (isHeavy) return "Heavy";
        return "Neither";
    }

    private boolean isLarge(int length, int width, int height) {
        return (long) length * width * height >= LARGE;
    }

    private boolean isWide(int length, int width, int height) {
        return length >= WIDE || width >= WIDE || height >= WIDE;
    }
}
