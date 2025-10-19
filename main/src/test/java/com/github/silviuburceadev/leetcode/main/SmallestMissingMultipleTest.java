package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SmallestMissingMultipleTest {

    private static final SmallestMissingMultiple IMPL = new SmallestMissingMultiple();

    @ParameterizedTest
    @MethodSource("testMissingMultipleSource")
    void testMissingMultiple(int[] nums, int k, int expected) {
        // when
        var actual = IMPL.missingMultiple(nums, k);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testMissingMultipleSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 8, 2, 3, 4, 6 }, 2, 10))
                .add(Arguments.of(new int[] { 1, 4, 7, 10, 15 }, 5, 5))
                .add(Arguments.of(new int[] { 83, 96, 34, 56, 48, 30, 7, 14, 77, 66, 66, 66, 21, 17, 38, 7, 9 }, 7, 28))
                .add(Arguments.of(new int[] { 1, 3, 5, 7 }, 2, 2))
                .add(Arguments.of(new int[] { -2, -3 }, 2, 2))
                .build();
    }
}
