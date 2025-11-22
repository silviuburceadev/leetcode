package com.github.silviuburceadev.leetcode.main;

import java.util.Arrays;

public class LexicographicallySmallestNegativePermutation {

    public int[] lexSmallestNegatedPerm(int n, long target) {
        if (Math.abs(target) > (long) n * (n + 1) / 2) {
            return new int[0];
        }

        for (int i = (int) Math.pow(2, n) - 1; i >= 0 ; i--) {
            var bits = Integer.toBinaryString(i).toCharArray();
            var num = toNum(bits);
            if (num == target) {
                return toArray(bits);
            }
        }

        return new int[0];
    }

    private int[] toArray(char[] bits) {
        var len = bits.length;
        var res = new int[bits.length];
        for (var i = 0; i < bits.length; i++) {
            res[i] = bits[i] == '1' ? -len : len;
            len--;
        }
        Arrays.sort(res);
        return res;
    }

    private int toNum(char[] bits) {
        var res = 0;
        var current = bits.length;
        for (var i = 0; i < bits.length; i++) {
            res += current * (bits[i] == '1' ? - 1 : 1);
            current--;
        }
        return res;
    }
}
