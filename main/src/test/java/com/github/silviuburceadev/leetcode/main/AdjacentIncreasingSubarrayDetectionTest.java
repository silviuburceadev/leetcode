package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AdjacentIncreasingSubarrayDetectionTest {

    private static final AdjacentIncreasingSubarrayDetection IMPL = new AdjacentIncreasingSubarrayDetection();

    @ParameterizedTest
    @MethodSource("testCasesSource")
    void testCases(List<Integer> nums, int k, boolean expected) {
        // when
        var actual = IMPL.hasIncreasingSubarrays(nums, k);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testCasesSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(List.of(2, 5, 7, 8, 9, 2, 3, 4, 3, 1), 3, true))
                .add(Arguments.of(List.of(1, 2, 3, 4, 4, 4, 4, 5, 6, 7), 5, false))
                .build();
    }
}