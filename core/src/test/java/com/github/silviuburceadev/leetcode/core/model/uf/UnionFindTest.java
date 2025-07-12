package com.github.silviuburceadev.leetcode.core.model.uf;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

interface UnionFindTest {

    UnionFind<String> getImpl();

    @Test
    default void testBasicUnionFindConnected() {
        GIVEN: {}
        var uf = getImpl();
        uf.union("a", "b");

        WHEN: {}
        boolean actual = uf.connected("a", "b");

        THEN: {}
        assertThat(actual).isTrue();
    }

    @Test
    default void testNotConnected() {
        GIVEN: {}
        var uf = getImpl();
        uf.union("a", "b");
        uf.union("c", "d");

        assertAll(
            () -> {
                WHEN: {}
                boolean actual = uf.connected("a", "e");

                THEN: {}
                assertThat(actual).isFalse();
            },
            () -> {
                WHEN: {}
                boolean actual = uf.connected("e", "a");

                THEN: {}
                assertThat(actual).isFalse();
            }
        );
    }

    @Test
    default void testBasicFind() {
        GIVEN: {}
        var uf = getImpl();
        uf.union("a", "b");
        uf.union("c", "d");

        WHEN: {}
        var actual = uf.find("d");

        THEN: {}
        assertThat(actual).isEqualTo("c");
    }

    @Test
    default void testBasicFindNoMapping() {
        GIVEN: {}
        var uf = getImpl();
        uf.union("a", "b");
        uf.union("c", "d");

        WHEN: {}
        var actual = uf.find("e");

        THEN: {}
        assertThat(actual).isEqualTo("e");
    }

    @Test
    default void testMergingGroups() {
        GIVEN: {}
        var uf = getImpl();
        uf.union("a", "b");
        uf.union("c", "d");
        // trigger merging a-b group with c-d group
        uf.union("b", "d");

        WHEN: {}
        var actual = uf.find("d");

        THEN: {}
        assertThat(actual).isEqualTo("a");
    }
}