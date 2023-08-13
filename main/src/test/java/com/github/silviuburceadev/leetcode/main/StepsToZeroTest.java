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
        assertEquals(1, IMPL.numberOfSteps(1));
    }
}
