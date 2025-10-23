package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.Strings;
import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(125)
public class ValidPalindrome {

    private static final String NON_LETTERS_DIGITS = "[^A-Za-z0-9]+";

    public boolean isPalindrome(String s) {
        return Strings.isPalindrome(s.replaceAll(NON_LETTERS_DIGITS, "").toLowerCase());
    }
}
