package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CountSubstringWithOnlyOnesTest {

    private static final CountSubstringWithOnlyOnes IMPL = new CountSubstringWithOnlyOnes();

    @ParameterizedTest
    @MethodSource("numSubSource")
    void numSub(String s, int expected) {
        // when
        var actual = IMPL.numSub(s);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> numSubSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("0110111", 9))
                .add(Arguments.of("101", 2))
                .add(Arguments.of("111111", 21))
                .add(Arguments.of(longString(), 200_542_505))
                .build();
    }

    private static String longString() {
        return "111000101010111100000" +
                "1".repeat(80000) +
                "001010" +
                "1".repeat(1002) +
                "00001001";
    }
}
