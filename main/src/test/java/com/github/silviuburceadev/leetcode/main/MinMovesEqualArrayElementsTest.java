package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

interface MinMovesEqualArrayElementsTest {

    MinMovesEqualArrayElements getImpl();

    @ParameterizedTest
    @MethodSource("minMovesSource")
    default void minMoves(int[] nums, int expected) {
        // when
        var actual = getImpl().minMoves(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> minMovesSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 2, 1, 3 }, 3))
                .add(Arguments.of(new int[] { 4, 4, 5 }, 2))
                .add(Arguments.of(new int[] { 100 }, 0))
                .build();
    }
}
