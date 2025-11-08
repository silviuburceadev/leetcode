package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestNonDecreasingSubarrayReplacementTest {

    private static final LongestNonDecreasingSubarrayReplacement IMPL = new LongestNonDecreasingSubarrayReplacement();

    @ParameterizedTest
    @MethodSource("longestSubarraySource")
    void longestSubarray(int[] nums, int expected) {
        // when
        var actual = IMPL.longestSubarray(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> longestSubarraySource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 3, 1, 2 }, 4))
                .add(Arguments.of(new int[] { 2, 2, 2, 2, 2 }, 5))
                .add(Arguments.of(new int[] { 1, 2, 3, 1, 4 }, 5))
                .add(Arguments.of(new int[] { 1, 2, 3, 1, 4, 5 }, 6))
                .add(Arguments.of(new int[] { 3, 2, 1, 2, 3, 4 }, 5))
                .add(Arguments.of(new int[] { 3, -4, -2 }, 3))
                .add(Arguments.of(new int[] { 6, -2, 1, 0, 0 }, 4))
                .add(Arguments.of(new int[] { 6, 7, -3, -5, 0, 0 }, 4))
                .add(Arguments.of(new int[] { 6, -2 }, 2))
                .build();
    }
}
