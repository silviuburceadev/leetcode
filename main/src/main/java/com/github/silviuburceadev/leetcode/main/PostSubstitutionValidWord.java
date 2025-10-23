package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(1003)
public class PostSubstitutionValidWord {

    private static final String ABC = "abc";

    // TODO try the stack way
    public boolean isValid(String s) {
        var sb = new StringBuilder(s);

        for (var index = sb.indexOf(ABC); index != -1; index = sb.indexOf(ABC)) {
            sb.delete(index, index + ABC.length());
        }

        return sb.isEmpty();
    }
}
