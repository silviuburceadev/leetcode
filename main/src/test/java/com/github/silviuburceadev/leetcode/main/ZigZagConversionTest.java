package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ZigZagConversionTest {

    private static final ZigZagConversion IMPL = new ZigZagConversion();

    @ParameterizedTest
    @MethodSource("testConvertSource")
    void testConvert(String s, int numRows, String expected) {
        // when
        var actual = IMPL.convert(s, numRows);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testConvertSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"))
                .add(Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI"))
                .add(Arguments.of("A", 1, "A"))
                .add(Arguments.of("ABABAB", 2, "AAABBB"))
                .build();
    }
}