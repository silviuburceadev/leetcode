package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(2169)
public class CountOperationsToZero {

    public int countOperations(int num1, int num2) {
        if (num2 == 0) return 0;
        return num1 / num2 + countOperations(num2, num1 % num2);
    }
}
