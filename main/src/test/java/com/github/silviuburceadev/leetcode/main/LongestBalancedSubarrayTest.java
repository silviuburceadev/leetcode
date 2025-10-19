package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestBalancedSubarrayTest {

    @ParameterizedTest
    @MethodSource("testLongestBalancedSource")
    void testLongestBalanced(int[] nums, int expected) {
        // when
        var actual = new LongestBalancedSubarray().longestBalanced(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testLongestBalancedSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 2, 5, 4, 3 }, 4))
                .add(Arguments.of(new int[] { 3, 2, 2, 5, 4 }, 5))
                .add(Arguments.of(new int[] { 1, 2, 3, 2 }, 3))
                .add(Arguments.of(new int[] { 6, 6 }, 0))
                .build();
    }

}