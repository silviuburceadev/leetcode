package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaximizeExpressionOfThreeTest {

    private static final MaximizeExpressionOfThree IMPL = new MaximizeExpressionOfThree();

    @ParameterizedTest
    @MethodSource("maximizeExpressionOfThreeSource")
    public void maximizeExpressionOfThree(int[] nums, int expected) {
        // when
        var actual = IMPL.maximizeExpressionOfThree(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> maximizeExpressionOfThreeSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 4, 2, 5 }, 8))
                .add(Arguments.of(new int[] { -2, 0, 5, -2, 4 }, 11))
                .add(Arguments.of(new int[] { 5, 5, -2, -1 }, 12))
                .add(Arguments.of(new int[] { 5, 5, 5 }, 5))
                .build();
    }
}
