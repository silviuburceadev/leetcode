package com.github.silviuburceadev.leetcode.main;

import java.util.Arrays;

public class CrawlerLogFolder {

    public int depth(String[] logs) {
        return Arrays.stream(logs)
            .mapToInt(x -> 1)
            .reduce(0, (a, b) -> {
                var res = a + b;
                return Math.max(res, 0);
            });
    }
}
