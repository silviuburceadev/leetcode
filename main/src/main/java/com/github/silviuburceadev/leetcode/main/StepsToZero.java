package com.github.silviuburceadev.leetcode.main;
/**
 * Problem 1342
 */
public class StepsToZero {

    /**
     * Return the number of steps needed to reach 0 if you halve the number when even or decrement when odd.
     * @param num   the given number
     * @return      the number of steps
     */
    public int numberOfSteps(int num) {
        return Integer.bitCount(num);
    }
}
