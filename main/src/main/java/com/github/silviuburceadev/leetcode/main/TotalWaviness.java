package com.github.silviuburceadev.leetcode.main;

public class TotalWaviness {

    public int totalWaviness(int num1, int num2) {
        var total = 0;
        for (var i = num1; i <= num2; i++) {
            total += waviness(i);
        }

        return total;
    }

    private int waviness(int num) {
        if (num < 100) return 0;

        var total = 0;

        var chars = String.valueOf(num).toCharArray();
        for (var i = 1; i < chars.length - 1; i++) {
            if (chars[i] > chars[i - 1] && chars[i] > chars[i + 1]) total++;
            if (chars[i] < chars[i - 1] && chars[i] < chars[i + 1]) total++;
        }

        return total;
    }
}
