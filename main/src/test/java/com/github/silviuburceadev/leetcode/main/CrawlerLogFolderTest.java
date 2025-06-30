package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.github.silviuburceadev.leetcode.main.CrawlerLogFolder.CWD;
import static com.github.silviuburceadev.leetcode.main.CrawlerLogFolder.PWD;
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

    @Test
    void testBaseCaseCurrentDir() {
        GIVEN: {}
        final var input = new String[] { CWD };
        WHEN: {}
        final var depth = IMPL.depth(input);
        THEN: {}
        assertThat(depth).isEqualTo(0);
    }

    @Test
    void testBaseCaseParentDir() {
        GIVEN: {}
        final var input = new String[] { PWD };
        WHEN: {}
        final var depth = IMPL.depth(input);
        THEN: {}
        assertThat(depth).isEqualTo(0);
    }

    @Test
    void testMultipleParentDir() {
        GIVEN: {}
        final var input = new String[] { PWD, PWD };
        WHEN: {}
        final var depth = IMPL.depth(input);
        THEN: {}
        assertThat(depth).isEqualTo(0);
    }

    @Test
    void testMultipleCurrentDir() {
        GIVEN: {}
        final var input = new String[] { CWD, CWD };
        WHEN: {}
        final var depth = IMPL.depth(input);
        THEN: {}
        assertThat(depth).isEqualTo(0);
    }

    @ParameterizedTest
    @MethodSource("input")
    void testMultipleLevels(String[] path, int expected) {
        GIVEN: {}
        final var input = path;
        WHEN: {}
        final var depth = IMPL.depth(input);
        THEN: {}
        assertThat(depth).isEqualTo(expected);
    }

    public static Stream<Arguments> input() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new String[] { "d1/","d2/","../","d21/","./" }, 2))
                .add(Arguments.of(new String[] { "d1/","d2/","./","d3/","../", "d31/" }, 3))
                .add(Arguments.of(new String[] { "d1/","../", "../","../" }, 0))
                .build();
    }
}
