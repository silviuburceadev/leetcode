package com.github.silviuburceadev.leetcode.core;

public final class Maths {

    private Maths() {
        // Utility class
    }

    /**
     * Returns the minimum number of bits required to represent number <code>n</code>.
     * <p>
     * The implementation adds 1 to the highest power of 2 less than or equal to <code>n</code>.
     *
     * @param n the given number to check
     * @return the number of bits
     */
    public static int bitCount(long n) {
        // ln(0) is not defined
        if (n == 0) return 1;
        return 1 + (int) (Math.log(n) / Math.log(2));
    }
}
