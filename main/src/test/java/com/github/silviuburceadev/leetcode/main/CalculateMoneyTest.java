package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CalculateMoneyTest {

    private static final CalculateMoney IMPL = new CalculateMoney();

    @ParameterizedTest
    @MethodSource("testTotalMoneySource")
    void testTotalMoney(int days, int expected) {
        // when
        var actual = IMPL.totalMoney(days);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testTotalMoneySource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(4, 10))
                .add(Arguments.of(10, 37))
                .add(Arguments.of(20, 96))
                .build();
    }
}
