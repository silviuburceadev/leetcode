package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumDistanceTripleTest {

    private static final MinimumDistanceTriple IMPL = new MinimumDistanceTriple();

    @ParameterizedTest
    @MethodSource("minimumDistanceSource")
    void minimumDistance(int[] nums, int expected) {
        // when
        var actual = IMPL.minimumDistance(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> minimumDistanceSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 1, 1, 3 }, 6))
                .add(Arguments.of(new int[] { 1, 1, 2, 3, 2, 1, 2 }, 8))
                .add(Arguments.of(new int[] { 1, 1, 1, 1 }, 4))
                .add(Arguments.of(new int[] { 1, 1, 2, 2 }, -1))
                .build();
    }
}
