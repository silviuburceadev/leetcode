package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class WaterBottlesTest {

    private static final WaterBottles IMPL = new WaterBottles();

    @ParameterizedTest
    @MethodSource("testNumWaterBottlesSource")
    void testNumWaterBottles(int numBottles, int numExchange, int expected) {
        // given
        var actual = IMPL.numWaterBottles(numBottles, numExchange);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testNumWaterBottlesSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(9, 3, 13))
                .add(Arguments.of(15, 4, 19))
                .build();
    }

    @ParameterizedTest
    @MethodSource("testMaxBottlesDrunkSource")
    void testMaxBottlesDrunk(int numBottles, int numExchange, int expected) {
        // given
        var actual = IMPL.maxBottlesDrunk(numBottles, numExchange);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testMaxBottlesDrunkSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(13, 6, 15))
                .add(Arguments.of(10, 3, 13))
                .build();
    }
}
