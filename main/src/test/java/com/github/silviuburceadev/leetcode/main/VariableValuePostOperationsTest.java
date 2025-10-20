package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class VariableValuePostOperationsTest {

    @ParameterizedTest
    @MethodSource("testFinalValueAfterOperationsSource")
    void testFinalValueAfterOperations(String[] operations, int expected) {
        // when
        var actual = new VariableValuePostOperations().finalValueAfterOperations(operations);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testFinalValueAfterOperationsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new String[] { "--X", "X++", "X++" }, 1))
                .add(Arguments.of(new String[] { "++X", "++X", "X++" }, 3))
                .add(Arguments.of(new String[] { "X++", "++X", "--X", "X--" }, 0))
                .add(Arguments.of(new String[] { "X++" }, 1))
                .add(Arguments.of(new String[] { "X++", "INVALID", null }, 1))
                .build();
    }
}
