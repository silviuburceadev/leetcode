package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Arrays;
import java.util.stream.Collectors;

@Problem(2154)
public class KeepMultiplyingByTwo {

    public int findFinalValue(int[] nums, int original) {
        var multiples = Arrays.stream(nums)
                .filter(x -> x % original == 0)
                .boxed()
                .collect(Collectors.toSet());

        var target = original;
        while (multiples.contains(target)) {
            target *= 2;
        }

        return target;
    }
}
