package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

/**
 * Problem 3330
 */
@Problem(3330)
public class FindOriginalString {

    /**
     * Count the number of extra repeats, e.g. only 3 for 'aaaa' or 5 for 'aaaabbb' and add one,
     * as the word might be intended word, with no accidental repeats.
     * @param word  the word
     * @return      the number of potentially correct words
     */
    public int possibleStringCount(String word) {
        int extraRepeats = 0;
        char[] chars = word.toCharArray();

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                extraRepeats++;
            }
        }

        return 1 + extraRepeats;
    }
}
