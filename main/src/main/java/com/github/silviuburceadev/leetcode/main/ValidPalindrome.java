package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.Strings;
import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(125)
public class ValidPalindrome {

    private static final String NON_LETTERS_DIGITS = "[^A-Za-z0-9]+";

    @Problem(125)
    public boolean isPalindrome(String s) {
        return Strings.isPalindrome(s.replaceAll(NON_LETTERS_DIGITS, "").toLowerCase());
    }

    @Problem(680)
    public boolean validPalindrome(String s) {
        var chars = s.toCharArray();

        for (int left = 0, right = chars.length - 1; left < right; left++, right--) {
            if (chars[left] != chars[right]) {
                return Strings.isPalindrome(s, left, right - 1) || Strings.isPalindrome(s, left + 1, right);
            }
        }

        return true;
    }
}
