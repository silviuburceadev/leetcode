package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SumElementsFrequencyDivisibleTest {

    private static final SumElementsFrequencyDivisible IMPL = new SumElementsFrequencyDivisible();

    private static Stream<Arguments> testCases() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1,2,2,3,3,3,3,4 }, 2, 16))
                .add(Arguments.of(new int[] { 1,2,3,4,5 }, 2, 0))
                .add(Arguments.of(new int[] { 4,4,4,1,2,3 }, 3, 12))
                .build();
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void baseCases(int[] numbers, int k, int expected) {
        WHEN: {}
        final var actual = IMPL.sumDivisibleByK(numbers, k);

        THEN: {}
        assertThat(actual).isEqualTo(expected);
    }

}