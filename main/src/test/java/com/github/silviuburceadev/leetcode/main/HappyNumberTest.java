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
}