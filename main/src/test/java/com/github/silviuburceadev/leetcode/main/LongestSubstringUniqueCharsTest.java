package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestSubstringUniqueCharsTest {

    private static final LongestSubstringUniqueChars IMPL = new LongestSubstringUniqueChars();

    @ParameterizedTest
    @MethodSource("testLengthOfLongestSubstringSource")
    void testLengthOfLongestSubstring(String input, int expected) {
        // when
        var actual = IMPL.lengthOfLongestSubstring(input);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testLengthOfLongestSubstringSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("abcabcbb", 3))
                .add(Arguments.of("bbbbb", 1))
                .add(Arguments.of("pwwkew", 3))
                .add(Arguments.of("abcdae", 5))
                .add(Arguments.of("adbcaef", 6))
                .add(Arguments.of("ohvhjdml", 6))
                .add(Arguments.of("ohvvjdml", 5))
                .build();
    }
}