package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    private static final ValidPalindrome IMPL = new ValidPalindrome();

    @ParameterizedTest
    @MethodSource("testIsPalindromeSource")
    void testIsPalindrome(String word, boolean expected) {
        // when
        var actual = IMPL.isPalindrome(word);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testIsPalindromeSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("A man, a plan, a canal: Panama", true))
                .add(Arguments.of("race a car", false))
                .add(Arguments.of(" ", true))
                .add(Arguments.of("ab_a ", true))
                .add(Arguments.of("0P", false))
                .add(Arguments.of("0P0", true))
                .build();
    }

    @ParameterizedTest
    @MethodSource("testValidPalindromeSource")
    void testValidPalindrome(String word, boolean expected) {
        // when
        var actual = IMPL.validPalindrome(word);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testValidPalindromeSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("aba", true))
                .add(Arguments.of("abca", true))
                .add(Arguments.of("abc", false))
                .add(Arguments.of("caba", true))
                .build();
    }
}
