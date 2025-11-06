package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class XSumKLongSubarrayTest {

    private static final XSumKLongSubarray IMPL = new XSumKLongSubarray();

    @ParameterizedTest
    @MethodSource("findXSumSource")
    void findXSum(int[] nums, int k, int x, int[] expected) {
        // when
        var actual = IMPL.findXSum(nums, k, x);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> findXSumSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 1, 2, 2, 3, 4, 2, 3 }, 6, 2, new int[] { 6, 10, 12 }))
                .add(Arguments.of(new int[] { 3, 8, 7, 8, 7, 5 }, 2, 2, new int[] { 11, 15, 15, 15, 12 }))
                .build();
    }
}

