package com.github.silviuburceadev.leetcode.main;

public class NumFlipsReverse {

    public int minimumFlips(int n) {
        var bits = Integer.toBinaryString(n);

        var res = 0;
        for (int i = 0, j = bits.length() - 1; i < j; i++, j--) {
            if (bits.charAt(i) != bits.charAt(j)) res += 2;
        }

        return res;
    }
}
