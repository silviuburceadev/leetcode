package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Arrays;

@Problem(3190)
public class MinMovesDivisibleByThree {

    public int minimumOperations(int[] nums) {
        var count = Arrays.stream(nums).filter(n -> n % 3 != 0).count();
        return Math.toIntExact(count);
    }
}
