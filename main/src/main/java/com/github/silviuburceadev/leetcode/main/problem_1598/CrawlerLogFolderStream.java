package com.github.silviuburceadev.leetcode.main.problem_1598;

import java.util.Arrays;

public class CrawlerLogFolderStream implements CrawlerLogFolder {

    @Override
    public int depth(String[] logs) {
        return Arrays.stream(logs)
            .filter(path -> !path.equals(CWD))
            .mapToInt(path -> PWD.equals(path) ? -1 : 1)
            .reduce(0, (a, b) -> {
                var res = a + b;
                return Math.max(res, 0);
            });
    }
}
