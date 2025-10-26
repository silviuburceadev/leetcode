package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumAlternatingSquaresTest {

    private static final MaximumAlternatingSquares IMPL = new MaximumAlternatingSquares();

    @ParameterizedTest
    @MethodSource("testMaxAlternatingSumSource")
    void testMaxAlternatingSum(int[] nums, long expected) {
        // when
        var actual = IMPL.maxAlternatingSum(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testMaxAlternatingSumSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 3 }, 12))
                .add(Arguments.of(new int[] { 1, -1, 2, -2, 3, -3 }, 16))
                .build();
    }
}
