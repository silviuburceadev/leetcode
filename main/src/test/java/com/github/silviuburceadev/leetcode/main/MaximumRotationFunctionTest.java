package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaximumRotationFunctionTest {

    private static final MaximumRotationFunction IMPL = new MaximumRotationFunction();

    @ParameterizedTest
    @MethodSource("testMaxRotateFunctionSource")
    void testMaxRotateFunction(int[] nums, int expected) {
        // when
        var actual = IMPL.maxRotateFunction(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testMaxRotateFunctionSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 4, 3, 2, 6 }, 26))
                .add(Arguments.of(new int[] { 100 }, 0))
                .build();
    }
}
