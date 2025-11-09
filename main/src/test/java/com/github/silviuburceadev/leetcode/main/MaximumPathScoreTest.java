package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumPathScoreTest {

    private static final MaximumPathScore IMPL = new MaximumPathScore();

    @ParameterizedTest
    @MethodSource("MaxPathScoreSource")
    void MaxPathScore(int[][] grid, int k, int expected) {
        // when
        var actual = IMPL.maxPathScore(grid, k);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> MaxPathScoreSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[][] { { 0, 1 }, { 2, 0 } }, 1, 2))
                .add(Arguments.of(new int[][] { { 0, 1, 1, 1 }, { 1, 2, 2, 0 }, { 1, 0, 1, 2 } }, 4, 7))
                .build();
    }
}
