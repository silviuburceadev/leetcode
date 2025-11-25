package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class SmallestIntegerDivisibleByKTest {

    private static final SmallestIntegerDivisibleByK IMPL = new SmallestIntegerDivisibleByK();

    @ParameterizedTest
    @MethodSource("smallestRepunitDivByKSource")
    void smallestRepunitDivByK(int k, int expected) {
        // when
        var actual = IMPL.smallestRepunitDivByK(k);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> smallestRepunitDivByKSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(1, 1))
                .add(Arguments.of(2, -1))
                .add(Arguments.of(3, 3))
                .add(Arguments.of(7, 6))
                .add(Arguments.of(17, 16))
                .build();
    }
}
