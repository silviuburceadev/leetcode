package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class NumFlipsReverseTest {

    private static final NumFlipsReverse IMPL = new NumFlipsReverse();

    @ParameterizedTest
    @MethodSource("minimumFlipsSource")
    void minimumFlips(int n, int expected) {
        // when
        var actual = IMPL.minimumFlips(n);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> minimumFlipsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(7, 0))
                .add(Arguments.of(10, 4))
                .build();
    }
}
