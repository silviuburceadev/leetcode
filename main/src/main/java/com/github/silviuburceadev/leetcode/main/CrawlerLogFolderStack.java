package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Stack;

@Problem(1598)
public class CrawlerLogFolderStack implements CrawlerLogFolder {

    @Override
    public int depth(String[] logs) {
        var stack = new Stack<String>();
        for (String path: logs) {
            if (CWD.equals(path)) continue;

            if (PWD.equals(path)) {
                if (stack.isEmpty()) continue;
                stack.pop();
                continue;
            }

            stack.push(path);
        }

        return stack.size();
    }
}
