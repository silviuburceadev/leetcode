package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DecimalRepresentationTest {

    private static final DecimalRepresentation IMPL = new DecimalRepresentation();

    private static Stream<Arguments> input() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(537, new int[] { 500, 30, 7 }))
                .add(Arguments.of(102, new int[] { 100, 2 }))
                .add(Arguments.of(6, new int[] { 6 }))
                .build();
    }

    @ParameterizedTest
    @MethodSource("input")
    void testBaseCase(int input, int[] expected) {
        GIVEN: {}
        final var word = input;
        WHEN: {}
        final var result = IMPL.decimalRepresentation(word);
        THEN: {}
        assertThat(result).isEqualTo(expected);
    }
}
