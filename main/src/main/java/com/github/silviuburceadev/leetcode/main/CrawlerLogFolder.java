package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

/**
 * Problem 1598
 */
@Problem(1598)
public interface CrawlerLogFolder {

    String CWD = "./";
    String PWD = "../";

    /**
     * Returns the distance needed to reach the root logs folder, i.e. the depth inside it
     * @param logs  the path fragments
     * @return      the depth
     */
    int depth(String[] logs);
}
