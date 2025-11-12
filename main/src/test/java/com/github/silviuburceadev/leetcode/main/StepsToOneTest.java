package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StepsToOneTest {

    private static final StepsToOne IMPL = new StepsToOne();

    @ParameterizedTest
    @MethodSource("numStepsSource")
    void numSteps(String s, int expected) {
        // when
        var actual = IMPL.numSteps(s);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> numStepsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("1101", 6))
                .add(Arguments.of("10", 1))
                .add(Arguments.of("100", 2))
                .add(Arguments.of("1", 0))
                .add(Arguments.of("11", 3))
                .add(Arguments.of("111", 4))
                .add(Arguments.of("1" + "0".repeat(10), 10))
                .add(Arguments.of("1".repeat(10), 11))
                .build();
    }
}
