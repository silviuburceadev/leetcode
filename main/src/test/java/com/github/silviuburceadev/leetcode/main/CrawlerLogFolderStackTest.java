package com.github.silviuburceadev.leetcode.main;

public class CrawlerLogFolderStackTest implements CrawlerLogFolderTest {

    @Override
    public CrawlerLogFolder getImpl() {
        return new CrawlerLogFolderStack();
    }
}
