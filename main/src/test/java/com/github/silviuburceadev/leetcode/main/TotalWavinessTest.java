package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TotalWavinessTest {

    private static final TotalWaviness IMPL = new TotalWaviness();

    @ParameterizedTest
    @MethodSource("TotalWavinessSource")
    void TotalWaviness(int num1, int num2, int expected) {
        // when
        var actual = IMPL.totalWaviness(num1, num2);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> TotalWavinessSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(120, 130, 3))
                .add(Arguments.of(198, 202, 3))
                .add(Arguments.of(4848, 4848, 2))
                .add(Arguments.of(48, 48, 0))
                .build();
    }
}
