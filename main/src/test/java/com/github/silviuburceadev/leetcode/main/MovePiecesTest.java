package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MovePiecesTest {

    private static final MovePieces IMPL = new MovePieces();

    @ParameterizedTest
    @MethodSource("testCanChangeSource")
    void testCanChange(String start, String target, boolean expected) {
        // when
        var actual = IMPL.canChange(start, target);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testCanChangeSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("_L__R__R_", "L______RR", true))
                .add(Arguments.of("R_L_", "__LR", false))
                .add(Arguments.of("R_", "_R", false))
                .build();
    }
}
