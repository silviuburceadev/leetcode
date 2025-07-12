package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;
import com.github.silviuburceadev.leetcode.core.model.uf.UnionFindMap;

/**
 * Problem 1061
 */
@Problem(1061)
public class LexicographicallySmallestEquivalent {

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        var uf = new UnionFindMap<Character>();

        for (var i = 0; i < s1.length(); i++) {
            uf.union(s1.charAt(i), s2.charAt(i));
        }

        var sb = new StringBuilder();

        for (char c: baseStr.toCharArray()) {
            sb.append(uf.find(c));
        }

        return sb.toString();
    }
}
