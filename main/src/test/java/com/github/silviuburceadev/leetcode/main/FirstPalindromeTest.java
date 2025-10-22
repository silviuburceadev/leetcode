package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class FirstPalindromeTest {

    private static final FirstPalindrome IMPL = new FirstPalindrome();

    @ParameterizedTest
    @MethodSource("firstPalindromeSource")
    void firstPalindrome(String[] words, String expected) {
        // when
        var actual = IMPL.firstPalindrome(words);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> firstPalindromeSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new String[] { "abc", "car", "ada", "racecar", "cool" }, "ada"))
                .add(Arguments.of(new String[] { "notapalindrome", "racecar"}, "racecar"))
                .add(Arguments.of(new String[] { "def","ghi"}, ""))
                .build();
    }
}
