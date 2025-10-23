package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SmoothDescentTest {

    private static final SmoothDescent IMPL = new SmoothDescent();

    @ParameterizedTest
    @MethodSource("testGetDescentPeriodsSource")
    void testGetDescentPeriods(int[] prices, long expected) {
        // when
        var actual = IMPL.getDescentPeriods(prices);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testGetDescentPeriodsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 3, 2, 1, 4 }, 7))
                .add(Arguments.of(new int[] { 8, 6, 7, 7 }, 4))
                .add(Arguments.of(new int[] { 1 }, 1))
                .build();
    }
}
