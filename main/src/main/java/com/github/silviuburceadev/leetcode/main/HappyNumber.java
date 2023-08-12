package com.github.silviuburceadev.leetcode.main;

public class HappyNumber {
    public boolean isHappy(int n) {
        return n == 1 || isHappy(squareDigitSum(n));
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
