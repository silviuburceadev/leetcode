package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(2109)
public class AddSpaces {
    public String addSpaces(String s, int[] spaces) {
        var sb = new StringBuilder(s.length() + spaces.length);

        var prev = 0;
        for (var space : spaces) {
            sb.append(s, prev, space).append(' ');
            prev = space;
        }

        return sb.append(s, prev, s.length()).toString();
    }
}
