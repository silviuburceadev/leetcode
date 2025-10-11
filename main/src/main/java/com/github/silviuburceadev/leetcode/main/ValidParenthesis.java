package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Map;
import java.util.Stack;

@Problem(20)
public class ValidParenthesis {

    private static final Map<Character, Character> PARENTHESIS =
            Map.of('(', ')', '[', ']', '{', '}');

    // TODO push the pair of the opening instead and when a closing comes, just check if stack's top is equal
    public boolean isValid(String s) {
        var stack = new Stack<Character>();
        var chars = s.toCharArray();

        for (var current : chars) {
            if (PARENTHESIS.containsKey(current)) {
                stack.push(current);
                continue;
            }

            if (stack.empty()) return false;

            // invalid parenthesis, matching parenthesis of previous is not equal to current, return early
            if (!PARENTHESIS.get(stack.peek()).equals(current)) return false;

            // valid parenthesis, get the opening out
            stack.pop();
        }

        return stack.empty();
    }
}
