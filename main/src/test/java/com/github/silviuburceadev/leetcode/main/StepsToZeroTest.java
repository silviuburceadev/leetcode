package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Problem 1342
 */
public class StepsToZeroTest {
    private static final StepsToZero IMPL = new StepsToZero();

    @Test
    public void checkBaseCase() {
        assertEquals(0, IMPL.numberOfSteps(0));
        assertEquals(1, IMPL.numberOfSteps(1));
    }

    @Test
    public void checkPowersOfTwo() {
        assertEquals(3, IMPL.numberOfSteps(4));
        assertEquals(4, IMPL.numberOfSteps(8));
    }

    @Test
    public void checkNonPowersOfTwo() {
        assertEquals(4, IMPL.numberOfSteps(5));
        assertEquals(5, IMPL.numberOfSteps(9));
        assertEquals(6, IMPL.numberOfSteps(14));
    }
}
