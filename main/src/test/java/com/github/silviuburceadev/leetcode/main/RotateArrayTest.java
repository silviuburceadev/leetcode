package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

interface RotateArrayTest {

    RotateArray getImpl();

    @ParameterizedTest
    @MethodSource("rotateSource")
    default void rotate(int[] nums, int k, int[] expected) {
        // when
        getImpl().rotate(nums, k);

        // then
        assertThat(nums).isEqualTo(expected);

    }

    static Stream<Arguments> rotateSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3, new int[] { 5, 6, 7, 1, 2, 3, 4 }))
                .add(Arguments.of(new int[] { -1, -100, 3, 99 }, 2, new int[] { 3, 99, -1, -100 }))
                .build();
    }
}
