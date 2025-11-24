package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.ArrayList;
import java.util.List;

@Problem(1018)
public class BinaryPrefixDivisibleByFive {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        var res = new ArrayList<Boolean>();
        var n = 0;

        for (int bit: nums) {
            n = ((n << 1) + bit) % 5;
            res.add(n % 5 == 0);
        }

        return res;
    }
}
