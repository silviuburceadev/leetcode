package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(1404)
public class StepsToOne {

    public int numSteps(String s) {
        var steps = 0;
        var carry = 0;

        for (var i = s.length() - 1; i > 0; i--) {
            var num = s.charAt(i) - '0' + carry;
            carry = (num + 1) / 2;
            num %= 2;
            // if num == 0, there is 1 step (div), if num == 1, there are 2 steps (add + div), so it's always num + 1
            steps += num + 1;
        }

        return steps + carry;
    }
}
