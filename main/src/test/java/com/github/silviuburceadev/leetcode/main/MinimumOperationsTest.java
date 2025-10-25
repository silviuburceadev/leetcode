package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumOperationsTest {

    private static final MinimumOperations IMPL = new MinimumOperations();

    @ParameterizedTest
    @MethodSource("testMinOperationsSource")
    void testMinOperations(int[] nums1, int[] nums2, long expected) {
        // when
        var actual = IMPL.minOperations(nums1, nums2);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testMinOperationsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 2, 8 }, new int[] { 1, 7, 3 }, 4))
                .add(Arguments.of(new int[] { 1, 3, 6 }, new int[] { 2, 4, 5, 3 }, 4))
                .add(Arguments.of(new int[] { 2 }, new int[] { 3, 4 }, 3))
                .build();
    }
}
