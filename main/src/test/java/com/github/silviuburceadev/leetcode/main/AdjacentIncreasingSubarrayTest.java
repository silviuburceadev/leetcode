package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AdjacentIncreasingSubarrayTest {

    private static final AdjacentIncreasingSubarray IMPL = new AdjacentIncreasingSubarray();

    @ParameterizedTest
    @MethodSource("testHasIncreasingSubarraysSource")
    void testHasIncreasingSubarrays(List<Integer> nums, int k, boolean expected) {
        // when
        var actual = IMPL.hasIncreasingSubarrays(nums, k);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testHasIncreasingSubarraysSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3, true))
                .add(Arguments.of(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5, false))
                .build();
    }

    @ParameterizedTest
    @MethodSource("testMaxIncreasingSubarraysSource")
    void testMaxIncreasingSubarrays(List<Integer> nums, int expected) {
        // when
        var actual = IMPL.maxIncreasingSubarrays(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testMaxIncreasingSubarraysSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3))
                .add(Arguments.of(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 2))
                .build();
    }
}