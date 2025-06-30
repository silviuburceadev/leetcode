package com.github.silviuburceadev.leetcode.main.problem_1598;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

public class CrawlerLogFolderMultipleTest {

    @DisplayName("CrawlerLogFolderStackTest")
    @Nested
    public class CrawlerLogFolderStackTest extends AbstractCrawlerLogFolderTest {

        public CrawlerLogFolderStackTest() {
            super(new CrawlerLogFolderStack());
        }
    }

    @DisplayName("CrawlerLogFolderStreamTest")
    @Nested
    public class CrawlerLogFolderStreamTest extends AbstractCrawlerLogFolderTest {

        public CrawlerLogFolderStreamTest() {
            super(new CrawlerLogFolderStream());
        }
    }

}
