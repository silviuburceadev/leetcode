package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountSubarrayMajorityElementTest {

    private static final CountSubarrayMajorityElement IMPL = new CountSubarrayMajorityElement();

    @ParameterizedTest
    @MethodSource("countMajoritySubarraysSource")
    void countMajoritySubarrays(int[] nums, int target, int expected) {
        // when
        var actual = IMPL.countMajoritySubarrays(nums, target);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> countMajoritySubarraysSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 2, 3 }, 2, 5))
                .add(Arguments.of(new int[] { 1, 1, 1, 1 }, 1, 10))
                .build();
    }
}
