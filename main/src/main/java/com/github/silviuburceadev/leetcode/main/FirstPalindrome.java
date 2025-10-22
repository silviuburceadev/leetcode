package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(2108)
public class FirstPalindrome {

    /**
     * Returns the first palindrome, if found, or empty string.
     * <p>
     * NOTE:
     * The below one-liner is too slow.
     * <code>return Arrays.stream(words).dropWhile(w -> !isPalindrome(w)).findFirst().orElse("");</code>
     *
     * @param words the given words
     * @return the first palindrome, if found, or empty string
     */
    public String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindrome(word)) return word;
        }

        return "";
    }

    private boolean isPalindrome(String word) {
        var chars = word.toCharArray();
        for (var i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) return false;
        }

        return true;
    }
}
