package com.github.silviuburceadev.leetcode.core;

import org.junit.jupiter.api.Test;

import static com.github.silviuburceadev.leetcode.core.Maths.numberOfBits;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsTest {

    @Test
    public void testNumberOfBits() {
        // power of 2
        assertEquals(4, numberOfBits(8));
    }
}
