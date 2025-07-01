package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class PalindromeNumberTest {

    private static final PalindromeNumber IMPL = new PalindromeNumber();

    @Test
    void testNegativeNumber() {
        GIVEN: {}
        int input = -59;
        WHEN: {}
        boolean result = IMPL.isPalindrome(input);
        THEN: {}
        assertThat(result).isFalse();
    }

    @Test
    void testSingleDigitNumber() {
        GIVEN: {}
        int input = 7;
        WHEN: {}
        boolean result = IMPL.isPalindrome(input);
        THEN: {}
        assertThat(result).isTrue();
    }

    @ParameterizedTest(name = "{0} is a palindrome")
    @ValueSource(ints = { 0, 121, 345543, 88, 223322 })
    void testValidNumbers(int x) {
        GIVEN: {}
        int input = x;
        WHEN: {}
        boolean result = IMPL.isPalindrome(input);
        THEN: {}
        assertThat(result).isTrue();
    }

    @ParameterizedTest(name = "{0} is not a palindrome")
    @ValueSource(ints = { 1231, 34525243, 288, 1223322 })
    void testInvalidNumbers(int x) {
        GIVEN: {}
        int input = x;
        WHEN: {}
        boolean result = IMPL.isPalindrome(input);
        THEN: {}
        assertThat(result).isFalse();
    }
}