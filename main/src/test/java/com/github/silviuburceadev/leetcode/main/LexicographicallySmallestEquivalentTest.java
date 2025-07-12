package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.params.provider.Arguments.of;

public class LexicographicallySmallestEquivalentTest {

    public static final LexicographicallySmallestEquivalent IMPL = new LexicographicallySmallestEquivalent();

    @Test
    void testNoReplacement() {
        GIVEN: {}
        var s1 = "abcd";
        var s2 = "efgh";
        var baseStr = "owl";

        WHEN: {}
        var result = IMPL.smallestEquivalentString(s1, s2, baseStr);

        THEN: {}
        assertThat(result).isEqualTo(baseStr);
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void testBaseCase(String s1, String s2, String baseStr, String output) {
        WHEN: {}
        var result = IMPL.smallestEquivalentString(s1, s2, baseStr);

        THEN: {}
        assertThat(result).isEqualTo(output);
    }

    static Stream<Arguments> testCases() {
        return Stream.<Arguments>builder()
            .add(of("parker", "morris", "parser", "makkek"))
            .add(of("hello", "world", "hold", "hdld"))
            .add(of("leetcode", "programs", "sourcecode", "aauaaaaada"))
            .build();
    }
}