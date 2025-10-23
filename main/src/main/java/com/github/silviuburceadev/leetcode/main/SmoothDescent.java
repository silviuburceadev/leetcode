package com.github.silviuburceadev.leetcode.main;

public class SmoothDescent {

    public long getDescentPeriods(int[] prices) {
        var total = 0L;
        var current = 1L;

        for (var i = 1; i < prices.length; i++) {
            if (prices[i - 1] - prices[i] == 1) {
                current++;
            }
            else {
                total += periods(current);
                current = 1;
            }

        }

        total += periods(current);

        return total;
    }

    private long periods(long current) {
        return current * (current + 1) / 2;
    }
}
