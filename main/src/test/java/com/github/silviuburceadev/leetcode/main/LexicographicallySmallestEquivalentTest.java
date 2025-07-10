package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LexicographicallySmallestEquivalentTest {

    public static final LexicographicallySmallestEquivalent IMPL = new LexicographicallySmallestEquivalent();

    @Test
    void testNoReplacement() {
        GIVEN: {}
        var s1 = "abcd";
        var s2 = "efgh";
        var baseStr = "hello";

        WHEN: {}
        var result = IMPL.smallestEquivalentString(s1, s2, baseStr);

        THEN: {}
        assertThat(result).isEqualTo(baseStr);
    }
}