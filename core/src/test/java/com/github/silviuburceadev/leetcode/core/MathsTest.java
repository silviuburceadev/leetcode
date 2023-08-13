package com.github.silviuburceadev.leetcode.core;

import org.junit.jupiter.api.Test;

import static com.github.silviuburceadev.leetcode.core.Maths.numberOfBits;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsTest {

    @Test
    public void testNumberOfBits() {
        // 2^n
        assertEquals(4, numberOfBits(8));
        assertEquals(7, numberOfBits(64));
        assertEquals(11, numberOfBits(1024));
        // 2^n + 1
        assertEquals(4, numberOfBits(14));
        assertEquals(7, numberOfBits(65));
        assertEquals(11, numberOfBits(1025));
        // 2^n - 1
        assertEquals(1, numberOfBits(0));
        assertEquals(3, numberOfBits(7));
        assertEquals(6, numberOfBits(63));
        assertEquals(10, numberOfBits(1023));
    }
}
