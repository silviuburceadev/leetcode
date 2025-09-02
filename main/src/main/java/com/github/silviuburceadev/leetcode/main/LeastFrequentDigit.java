package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(3663)
public class LeastFrequentDigit {

    public int getLeastFrequentDigit(int n) {
        var digitFrequency = new int[10];
        for (var digit = n % 10; n > 0; n /= 10, digit = n % 10) {
            digitFrequency[digit]++;
        }

        var min = Integer.MAX_VALUE;
        var index = -1;
        for (var i = 0; i < digitFrequency.length; i++) {
            var freq = digitFrequency[i];
            if (freq == 0) continue;
            if (min > freq) {
                min = freq;
                index = i;
            }
        }

        return index;
    }
}
