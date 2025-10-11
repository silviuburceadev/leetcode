package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumProductTest {

    private static final MaximumProduct IMPL = new MaximumProduct();

    @ParameterizedTest
    @MethodSource("maxProductSource")
    void maxProduct(int[] nums, long expected) {
        // when
        var actual = IMPL.maxProduct(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> maxProductSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { -5, 7, 0 }, 3_500_000L))
                .add(Arguments.of(new int[] { -4,-2,-1,-3 }, 1_200_000L))
                .add(Arguments.of(new int[] { 0, 10, 0 }, 0L))
                .build();
    }
}