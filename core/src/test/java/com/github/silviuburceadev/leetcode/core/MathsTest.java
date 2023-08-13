package com.github.silviuburceadev.leetcode.core;

import org.junit.jupiter.api.Test;

import static com.github.silviuburceadev.leetcode.core.Maths.bitCount;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathsTest {

    @Test
    public void testBitCount() {
        // 2^n
        assertEquals(4, bitCount(8));
        assertEquals(7, bitCount(64));
        assertEquals(11, bitCount(1024));
        // 2^n + 1
        assertEquals(4, bitCount(14));
        assertEquals(7, bitCount(65));
        assertEquals(11, bitCount(1025));
        // 2^n - 1
        assertEquals(1, bitCount(0));
        assertEquals(3, bitCount(7));
        assertEquals(6, bitCount(63));
        assertEquals(10, bitCount(1023));
    }
}
