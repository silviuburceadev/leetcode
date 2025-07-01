package com.github.silviuburceadev.leetcode.main;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

/**
 * Problem 3330
 */
public class FindOriginalString {

    /**
     * Count the number of extra repeats, e.g. only 3 for 'aaaa' or 5 for 'aaaabbb' and add one,
     * as the word might be intended word, with no accidental repeats.
     * @param word  the word
     * @return      the number of potentially correct words
     */
    public int possibleStringCount(String word) {
        int extraRepeats = word.chars()
                .boxed()
                // compute the frequency
                .collect(groupingBy(c -> c - '0', summingInt(x -> 1)))
                .values()
                .stream()
                // count only extra repeats
                .mapToInt(count -> count - 1)
                .sum();
        return 1 + extraRepeats;
    }
}
