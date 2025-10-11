package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.stream.IntStream;

@Problem(6)
public class ZigZagConversion {

    /**
     * Converts a given string to its zigzag representation.
     *
     * @param s       the given numbers
     * @param numRows the size of the zigzag
     * @return the zigzag representation
     */
    public String convert(String s, int numRows) {
        if (numRows == 1) return s;
        if (numRows == 2) {
            var result = new StringBuilder();
            var chars = s.toCharArray();
            for (var i = 0; i < s.length(); i += 2) result.append(chars[i]);
            for (var i = 1; i < s.length(); i += 2) result.append(chars[i]);
            return result.toString();
        }

        var rows = IntStream.range(0, numRows).mapToObj(StringBuilder::new).toList();

        var chars = s.toCharArray();
        var i = 0;
        while (i < chars.length) {
            // down
            for (var j = 0; j < numRows && i < chars.length; j++) {
                rows.get(j).append(chars[i++]);
            }
            // diagonal-up
            for (var j = numRows - 2; j > 0 && i < chars.length; j--) {
                rows.get(j).append(chars[i++]);
            }
        }

        return String.join("", rows);
    }
}
