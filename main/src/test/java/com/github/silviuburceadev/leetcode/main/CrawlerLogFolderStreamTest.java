package com.github.silviuburceadev.leetcode.main;

public class CrawlerLogFolderStreamTest implements CrawlerLogFolderTest {

    @Override
    public CrawlerLogFolder getImpl() {
        return new CrawlerLogFolderStream();
    }
}
