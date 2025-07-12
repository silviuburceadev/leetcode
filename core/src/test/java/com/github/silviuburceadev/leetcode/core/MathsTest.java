package com.github.silviuburceadev.leetcode.core;

import org.junit.jupiter.api.Test;

import static com.github.silviuburceadev.leetcode.core.Maths.bitCount;
import static org.assertj.core.api.Assertions.assertThat;

public class MathsTest {

    @Test
    public void testBitCount() {
        // 2^n
        assertThat(bitCount(8)).isEqualTo(4);
        assertThat(bitCount(64)).isEqualTo(7);
        assertThat(bitCount(1024)).isEqualTo(11);
        // 2^n + 1
        assertThat(bitCount(14)).isEqualTo(4);
        assertThat(bitCount(65)).isEqualTo(7);
        assertThat(bitCount(1025)).isEqualTo(11);
        // 2^n - 1
        assertThat(bitCount(0)).isEqualTo(1);
        assertThat(bitCount(7)).isEqualTo(3);
        assertThat(bitCount(63)).isEqualTo(6);
        assertThat(bitCount(1023)).isEqualTo(10);
    }
}
