package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StringToIntegerTest {

    private static final StringToInteger IMPL = new StringToInteger();

    @ParameterizedTest
    @MethodSource("testMyAtoiSource")
    void testMyAtoi(String input, int expected) {
        // when
        var actual = IMPL.myAtoi(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testMyAtoiSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("42", 42))
                .add(Arguments.of(" -042", -42))
                .add(Arguments.of("1337c0d3", 1337))
                .add(Arguments.of("0-1", 0))
                .add(Arguments.of("words and 987", 0))
                .add(Arguments.of("   ", 0))
                .add(Arguments.of("+100", 100))
                .add(Arguments.of("2147483648", Integer.MAX_VALUE))
                .add(Arguments.of("-2147483649", Integer.MIN_VALUE))
                .build();
    }
}
