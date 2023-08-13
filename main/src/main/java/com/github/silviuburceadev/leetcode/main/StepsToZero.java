package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.Maths;

/**
 * Problem 1342
 */
public class StepsToZero {

    /**
     * Return the number of steps needed to reach 0 if you halve the number when even or decrement when odd.
     * <p>
     * Counts the number of set bits, when you need to decrement, and the number of total bits, excluding
     * the first bit, where you need to half to reach 1.
     *
     * @param num the given number
     * @return the number of steps
     */
    public int numberOfSteps(int num) {
        return Maths.bitCount(num) + Integer.bitCount(num) - 1;
    }
}
