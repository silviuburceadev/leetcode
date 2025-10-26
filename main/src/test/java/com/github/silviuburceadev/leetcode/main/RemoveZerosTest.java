package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RemoveZerosTest {

    private static final RemoveZeros IMPL = new RemoveZeros();

    @ParameterizedTest
    @MethodSource("testRemoveZeroesSource")
    void testRemoveZeroes(long n, long expected) {
        // when
        var actual = IMPL.removeZeros(n);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testRemoveZeroesSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(1020030L, 123L))
                .add(Arguments.of(1L, 1L))
                .build();
    }
}
