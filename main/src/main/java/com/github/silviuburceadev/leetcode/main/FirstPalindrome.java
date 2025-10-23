package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import static com.github.silviuburceadev.leetcode.core.Strings.isPalindrome;

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
}
