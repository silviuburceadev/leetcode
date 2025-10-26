package com.github.silviuburceadev.leetcode.main;

public class RemoveZeros {
    
    public long removeZeros(long n) {
        long res = 0;
        long multiplier = 1;
        while (n != 0) {
            var digit = n % 10;
            if (digit != 0) {
                res += digit * multiplier;
                multiplier *= 10;
            }
            n /= 10;
        }

        return res;
    }
}
