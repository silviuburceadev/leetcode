package com.github.silviuburceadev.leetcode.main;

public class MinMovesEqualArrayElementsLoop implements MinMovesEqualArrayElements {

    @Override
    public int minMoves(int[] nums) {
        var max = Integer.MIN_VALUE;
        var total = 0;
        for (var num: nums) {
            max = Math.max(max, num);
            total += num;
        }
        return max * nums.length - total;
    }
}
