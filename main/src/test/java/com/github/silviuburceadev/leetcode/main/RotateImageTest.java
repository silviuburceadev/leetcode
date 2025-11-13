package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

class RotateImageTest {

    private static final RotateImage IMPL = new RotateImage();

    @ParameterizedTest
    @MethodSource("rotateSource")
    void rotate(int[][] matrix, int[][] expected) {
        // when
        IMPL.rotate(matrix);

        // then
        assertThat(matrix).isEqualTo(expected);
    }

    private static Stream<Arguments> rotateSource() {
        return Stream.<Arguments>builder()
                .add(of(new int[0][0], new int[0][0]))
                .add(of(new int[1][2], new int[1][2]))
                .add(of(new int[][] { {}, { 1 } }, new int[][] { {}, { 1 } }))
                .add(of(
                        new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
                        new int[][] { { 7, 4, 1 }, { 8, 5, 2 }, { 9, 6, 3 } }
                ))
                .build();
    }
}
