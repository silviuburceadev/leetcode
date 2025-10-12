package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestFibonacciTest {

    private static final LongestFibonacci IMPL = new LongestFibonacci();

    @ParameterizedTest
    @MethodSource("testCasesSource")
    void testCases(int[] input, int expected) {
        // when
        var actual = IMPL.longestSubarray(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testCasesSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 1, 1, 1, 2, 3, 5, 1 }, 5))
                .add(Arguments.of(new int[] { 5, 2, 7, 9, 16 }, 5))
                .add(Arguments.of(new int[] { 1000000000, 1000000000, 1000000000 }, 2))
                .add(Arguments.of(new int[] { 1, 1, 3, 2 }, 2))
                .add(Arguments.of(new int[] { 1 }, 1))
                .build();
    }
}
