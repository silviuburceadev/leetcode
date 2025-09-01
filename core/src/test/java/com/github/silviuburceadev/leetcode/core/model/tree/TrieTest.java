package com.github.silviuburceadev.leetcode.core.model.tree;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrieTest {

    @Test
    void testBasicInsertSearch() {
        GIVEN: {}
        var trie = new Trie();
        var input = "something";
        trie.insert(input);

        WHEN: {}
        var actual = trie.search(input);

        THEN: {}
        assertThat(actual).isTrue();
    }

    @Test
    void testMultiInsertSearch() {
        GIVEN: {}
        var trie = new Trie();
        var initial = "some";
        var input = "something";
        trie.insert(initial);
        trie.insert(input);

        WHEN: {}
        var actual = trie.search(input);

        THEN: {}
        assertThat(actual).isTrue();
    }

    @Test
    void testBasicInsertPrefix() {
        GIVEN: {}
        var trie = new Trie();
        var input = "something";
        trie.insert(input);

        WHEN: {}
        var actual = trie.startsWith(input);

        THEN: {}
        assertThat(actual).isTrue();
    }

    @Test
    void testBasicInsertSearchSamePrefix() {
        GIVEN: {}
        var trie = new Trie();
        var toInsert = "apple";
        var toSearch = "app";
        trie.insert(toInsert);

        WHEN: {}
        var actual = trie.search(toSearch);

        THEN: {}
        assertThat(actual).isFalse();
    }

    @Test
    void testBasicSearchNoMatch() {
        GIVEN: {}
        var trie = new Trie();
        var input = "something";

        WHEN: {}
        var actual = trie.search(input);

        THEN: {}
        assertThat(actual).isFalse();
    }

    @Test
    void testBasicPrefixNoMatch() {
        GIVEN: {}
        var trie = new Trie();
        var input = "something";

        WHEN: {}
        var actual = trie.startsWith(input);

        THEN: {}
        assertThat(actual).isFalse();
    }

    @Test
    void testBasicPrefix() {
        GIVEN: {}
        var trie = new Trie();
        var toInsert = "apple";
        var toSearch = "app";
        trie.insert(toInsert);

        WHEN: {}
        var actual = trie.startsWith(toSearch);

        THEN: {}
        assertThat(actual).isTrue();
    }
}