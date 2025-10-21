package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(2396)
public class StrictlyPalindromicNumber {

    /**
     * Returns false, as no such number exists.
     * <p>
     * Proof: Suppose we want to represent <code>n</code> in base <code>n - 2</code>. <code>n</code> equals to
     * <code>1 * (n - 2)^1 + 2 * (n - 2)^0</code> so <code>n</code>'s representation will be <code>12</code>,
     * which isn't palindromic. The only exception is 4, which in base is 100, which also isn't palindromic.
     *
     * @param n the given number
     * @return false
     */
    public boolean isStrictlyPalindromic(int n) {
        return false;
    }
}
