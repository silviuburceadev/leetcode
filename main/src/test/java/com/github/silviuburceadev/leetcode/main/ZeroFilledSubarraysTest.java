package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ZeroFilledSubarraysTest {

    private static final ZeroFilledSubarrays IMPL = new ZeroFilledSubarrays();

    @ParameterizedTest
    @MethodSource("testZeroFilledSubarraySource")
    void testZeroFilledSubarray(int[] nums, long expected) {
        // when
        var actual = IMPL.zeroFilledSubarray(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testZeroFilledSubarraySource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 3, 0, 0, 2, 0, 0, 4 }, 6))
                .add(Arguments.of(new int[] { 0, 0, 0, 2, 0, 0 }, 9))
                .add(Arguments.of(new int[] { 2, 10, 2019 }, 0))
                .add(Arguments.of(new int[100_000], 5_000_050_000L))
                .build();
    }
}
