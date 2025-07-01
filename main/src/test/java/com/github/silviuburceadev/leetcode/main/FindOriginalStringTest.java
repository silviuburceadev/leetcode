package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class FindOriginalStringTest {

    private static final FindOriginalString IMPL = new FindOriginalString();

    public static Stream<Arguments> input() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("abbcccc", 5))
                .add(Arguments.of("abcd", 1))
                .add(Arguments.of("aaaa", 4))
                .build();
    }

    @ParameterizedTest
    @MethodSource("input")
    void testBaseCase(String input, int expected) {
        GIVEN: {}
        final var word = input;
        WHEN: {}
        final var result = IMPL.possibleStringCount(word);
        THEN: {}
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void testWordWithNonConsecutiveRepeatedChars() {
        GIVEN: {}
        final var word = "ere";
        WHEN: {}
        final var result = IMPL.possibleStringCount(word);
        THEN: {}
        assertThat(result).isEqualTo(1);
    }
}