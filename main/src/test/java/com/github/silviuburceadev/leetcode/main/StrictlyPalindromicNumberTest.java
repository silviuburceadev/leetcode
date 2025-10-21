package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StrictlyPalindromicNumberTest {

    private static final StrictlyPalindromicNumber IMPL = new StrictlyPalindromicNumber();

    @ParameterizedTest
    @MethodSource("testIsStrictlyPalindromicSource")
    void testIsStrictlyPalindromic(int n, boolean expected) {
        // when
        var actual = IMPL.isStrictlyPalindromic(n);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testIsStrictlyPalindromicSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(2, false))
                .add(Arguments.of(3, false))
                .add(Arguments.of(5, false))
                .add(Arguments.of(6, false))
                .add(Arguments.of(10, false))
                .build();
    }
}
