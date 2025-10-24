package com.github.silviuburceadev.leetcode.core;

public final class Strings {

    private Strings() {
        // Utility class
    }

    public static boolean isPalindrome(String word) {
        return isPalindrome(word, 0, word.length() - 1);
    }

    public static boolean isPalindrome(String word, int start, int end) {
        var chars = word.toCharArray();

        for (int left = start, right = end; left <= right; left++, right--) {
            if (chars[left] != chars[right]) return false;
        }

        return true;
    }
}
