package com.github.silviuburceadev.leetcode.main;

public class MaxNumberSquareDigits {

    public String maxSumOfSquares(int num, int sum) {
        if (sum > num * 9) return "";

        var sb = new StringBuilder();
        while (--num >= 0) {
            if (sum > 9) {
                sb.append(9);
                sum -= 9;
            } else {
                sb.append(sum);
                sum = 0;
            }
        }

        return sb.toString();
    }
}
