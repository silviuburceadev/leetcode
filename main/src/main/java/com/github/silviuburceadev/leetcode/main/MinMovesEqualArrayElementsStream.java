package com.github.silviuburceadev.leetcode.main;

import java.util.Arrays;

public class MinMovesEqualArrayElementsStream implements MinMovesEqualArrayElements {

    @Override
    public int minMoves(int[] nums) {
        if (nums.length == 1) return 0;

        var stats = Arrays.stream(nums).summaryStatistics();
        return (int) (nums.length * stats.getMax() - stats.getSum());
    }
}
