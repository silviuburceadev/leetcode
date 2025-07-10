package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

/**
 * Problem 9
 */
@Problem(9)
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        return new StringBuilder().append(x).reverse().toString()
                .equals(String.valueOf(x));
    }
}
