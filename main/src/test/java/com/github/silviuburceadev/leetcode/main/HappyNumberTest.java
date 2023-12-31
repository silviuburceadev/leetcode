package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HappyNumberTest {

    private static final HappyNumber IMPL = new HappyNumber();

    @Test
    public void testBaseCase() {
        GIVEN: {}
        int n = 1;
        WHEN: {}
        boolean result = IMPL.isHappy(n);
        THEN: {}
        Assertions.assertTrue(result);
    }

    @Test
    public void testMultiDigitBaseCase() {
        GIVEN: {}
        int n = 10;
        WHEN: {}
        boolean result = IMPL.isHappy(n);
        THEN: {}
        Assertions.assertTrue(result);
    }

    @Test
    public void testMultiDigitRecursive() {
        GIVEN: {}
        // 68 -> 100 (36 + 64) -> 1
        int n = 68;
        WHEN: {}
        boolean result = IMPL.isHappy(n);
        THEN: {}
        Assertions.assertTrue(result);
    }

    @Test
    public void testInvalidBaseCase() {
        GIVEN: {}
        int n = 2;
        WHEN: {}
        boolean result = IMPL.isHappy(n);
        THEN: {}
        Assertions.assertFalse(result);
    }
}
