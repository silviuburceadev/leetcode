package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.HashSet;

@Problem(3)
public class LongestSubstringUniqueChars {

    public int lengthOfLongestSubstring(String s) {
        var max = 0;
        var visited = new HashSet<Character>();
        var chars = s.toCharArray();

        for (var i = 0; i < chars.length; i++) {
            char current = chars[i];
            var isUnique = visited.add(current);
            var size = visited.size();
            if (isUnique) {
                max = Math.max(max, size);
            } else {
                // remove chars from the starting of the sequence up to current char, e.g. for ohvhjdml, visited will
                // contain ohv and then for the next h it has to remove all chars before the previous h, which is o.
                var j = i - size;
                while (current != chars[j]) {
                    visited.remove(chars[j++]);
                }
            }
        }

        return max;
    }
}
