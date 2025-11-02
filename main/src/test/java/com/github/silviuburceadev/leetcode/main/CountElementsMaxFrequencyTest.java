package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

interface CountElementsMaxFrequencyTest {

    CountElementsMaxFrequency getImpl();

    @ParameterizedTest
    @MethodSource("maxFrequencyElementsSource")
    default void maxFrequencyElements(int[] nums, int expected) {
        // when
        var actual = getImpl().maxFrequencyElements(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> maxFrequencyElementsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 2, 3, 1, 4 }, 4))
                .add(Arguments.of(new int[] { 1, 2, 3, 4, 5 }, 5))
                .add(Arguments.of(new int[] { 15 }, 1))
                .build();
    }
}
