package com.github.silviuburceadev.leetcode.core;

public final class Strings {

    private Strings() {
        // Utility class
    }

    public static boolean isPalindrome(String word) {
        var chars = word.toCharArray();
        for (var i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) return false;
        }

        return true;
    }
}
