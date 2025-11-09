package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ContainerMostWaterTest {

    private static final ContainerMostWater IMPL = new ContainerMostWater();

    @ParameterizedTest
    @MethodSource("maxAreaSource")
    void maxArea(int[] height, int expected) {
        // when
        var actual = IMPL.maxArea(height);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> maxAreaSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 }, 49))
                .add(Arguments.of(new int[] { 1, 1 }, 1))
                .build();
    }
}
