package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountOperationsToZeroTest {

    @ParameterizedTest
    @MethodSource("countOperationsSource")
    void countOperations(int num1, int num2, int expected) {
        // when
        var actual = new CountOperationsToZero().countOperations(num1, num2);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> countOperationsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(2, 3, 3))
                .add(Arguments.of(10, 10, 1))
                .build();
    }
}
