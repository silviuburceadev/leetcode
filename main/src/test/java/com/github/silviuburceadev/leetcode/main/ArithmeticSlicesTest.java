package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ArithmeticSlicesTest {

    private static final ArithmeticSlices IMPL = new ArithmeticSlices();

    @ParameterizedTest
    @MethodSource("numberOfArithmeticSlicesSource")
    void numberOfArithmeticSlices(int[] nums, int expected) {
        // when
        var actual = IMPL.numberOfArithmeticSlices(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> numberOfArithmeticSlicesSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 3, 4 }, 3))
                .add(Arguments.of(new int[] { 1 }, 0))
                .add(Arguments.of(new int[] { 1, 2, 4 }, 0))
                .add(Arguments.of(new int[] { 1, 3, 5, 7, 9 }, 6))
                .add(Arguments.of(new int[] { 7, 7, 7, 7 }, 3))
                .add(Arguments.of(new int[] { 3, -1, -5, -9 }, 3))
                .build();
    }
}
