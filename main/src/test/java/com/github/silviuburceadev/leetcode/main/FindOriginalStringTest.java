package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FindOriginalStringTest {

    private static final FindOriginalString IMPL = new FindOriginalString();

    @Test
    void testBaseCase() {
        GIVEN: {}
        final var word = "abbcccc";
        WHEN: {}
        final var result = IMPL.possibleStringCount(word);
        THEN: {}
        assertThat(result).isEqualTo(5);
    }
}