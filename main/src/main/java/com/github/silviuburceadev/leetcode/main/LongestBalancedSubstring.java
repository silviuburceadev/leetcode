package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.HashSet;

@Problem(3713)
public class LongestBalancedSubstring {

    public int longestBalanced(String s) {
        final var chars = s.toCharArray();
        var max = 0;

        for (var i = 0; i < chars.length; i++) {
            var maxFreq = 0;
            var freq = new int[26];
            var distinct = new HashSet<>();
            for (var j = i; j < chars.length; j++) {
                var c = chars[j] - 'a';
                // for each char, add it to visited and increase its frequency
                distinct.add(c);
                maxFreq = Math.max(maxFreq, ++freq[c]);

                // to be a balanced subsequence, its must have all its distinct chars appear exactly maxFreq times
                // so length = distinct * maxFreq
                var substringLength = j - i + 1;
                if (substringLength == distinct.size() * maxFreq) {
                    max = Math.max(max, substringLength);
                }
            }
        }

        return max;
    }
}
