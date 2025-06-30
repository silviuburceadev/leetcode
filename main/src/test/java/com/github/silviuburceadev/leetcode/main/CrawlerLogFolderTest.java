package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CrawlerLogFolderTest {

    private static final CrawlerLogFolder IMPL = new CrawlerLogFolder();

    @Test
    void testBaseCaseOneFolder() {
        GIVEN: {}
        final var input = new String[] { "d1/" };
        WHEN: {}
        final var depth = IMPL.depth(input);
        THEN: {}
        assertThat(depth).isEqualTo(1);
    }
}
