package com.github.silviuburceadev.leetcode.core;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

class MatrixUtilsTest {

    @ParameterizedTest
    @MethodSource("transposeSource")
    void transpose(int[][] matrix, int[][] expected) {
        // when
        MatrixUtils.transpose(matrix);

        // then
        assertThat(matrix).isEqualTo(expected);
    }

    public static Stream<Arguments> transposeSource() {
        return Stream.<Arguments>builder()
                .add(of(new int[0][], new int[0][]))
                .add(of(new int[1][2], new int[1][2]))
                .add(of(new int[][] { {1, 2}, { 3, 4 } }, new int[][] { { 1, 3 }, { 2, 4 } }))
                .add(of(
                        new int[][] { {1, 2, 3}, { 4, 5, 6 }, { 7, 8, 9 } },
                        new int[][] { { 1, 4, 7 }, { 2, 5, 8 }, { 3, 6, 9 } }
                    )
                )
                .build();
    }

}
