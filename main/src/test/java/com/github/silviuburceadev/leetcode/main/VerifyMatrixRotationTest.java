package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class VerifyMatrixRotationTest {

    private static final VerifyMatrixRotation IMPL = new VerifyMatrixRotation();

    @ParameterizedTest
    @MethodSource("findRotationSource")
    void findRotation(int[][] mat, int[][] target, boolean expected) {
        // when
        var actual = IMPL.findRotation(mat, target);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> findRotationSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[][] { { 0, 1 }, { 1, 0 } }, new int[][] { { 1, 0 }, { 0, 1 } }, true))
                .add(Arguments.of(new int[][] { { 0, 1 }, { 1, 1 } }, new int[][] { { 1, 0 }, { 0, 1 } }, false))
                .add(Arguments.of(
                        new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 1, 1, 1 } },
                        new int[][] { { 1, 1, 1 }, { 0, 1, 0 }, { 0, 0, 0 } },
                        true))
                .add(Arguments.of(new int[2][2], new int[3][3], false))
                .build();
    }
}
