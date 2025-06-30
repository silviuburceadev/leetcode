package com.github.silviuburceadev.leetcode.main;

import java.util.Arrays;

public class CrawlerLogFolder {

    public static final String CWD = "./";

    public int depth(String[] logs) {
        return Arrays.stream(logs)
            .filter(path -> !path.equals(CWD))
            .mapToInt(x -> 1)
            .reduce(0, (a, b) -> {
                var res = a + b;
                return Math.max(res, 0);
            });
    }
}
