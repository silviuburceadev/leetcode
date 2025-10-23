package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidPalindromeTest {

    private static final ValidPalindrome IMPL = new ValidPalindrome();

    @ParameterizedTest
    @MethodSource("firstPalindromeSource")
    void firstPalindrome(String word, boolean expected) {
        // when
        var actual = IMPL.isPalindrome(word);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> firstPalindromeSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("A man, a plan, a canal: Panama", true))
                .add(Arguments.of("race a car", false))
                .add(Arguments.of(" ", true))
                .add(Arguments.of("ab_a ", true))
                .add(Arguments.of("0P", false))
                .add(Arguments.of("0P0", true))
                .build();
    }

}