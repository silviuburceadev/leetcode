package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.IntStream;

@Problem(3731)
public class MissingElements {

    public List<Integer> findMissingElements(int[] nums) {
        var entries = new TreeSet<Integer>();
        for (var num : nums) {
            entries.add(num);
        }

        // no missing elements
        var diff = entries.getLast() - entries.getFirst() + 1;
        if (diff == nums.length) return List.of();

        return IntStream.rangeClosed(entries.getFirst(), entries.getLast())
                .filter(x -> !entries.contains(x))
                .boxed()
                .toList();
    }
}
