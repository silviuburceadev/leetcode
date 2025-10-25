package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MaxNumberSquareDigitsTest {

    private static final MaxNumberSquareDigits IMPL = new MaxNumberSquareDigits();

    @ParameterizedTest
    @MethodSource("testMaxSumOfSquaresTest")
    void testMaxSumOfSquares(int num, int sum, String expected) {
        // when
        var actual = IMPL.maxSumOfSquares(num, sum);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testMaxSumOfSquaresTest() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(2, 3, "30"))
                .add(Arguments.of(2, 17, "98"))
                .add(Arguments.of(1, 10, ""))
                .build();
    }
}
