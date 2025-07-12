package com.github.silviuburceadev.leetcode.core.model;

import com.github.silviuburceadev.leetcode.core.meta.Problem;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TrieTest {

    @Test
    void testBasicInsertSearch() {
        GIVEN: {}
        var trie = new Trie();
        trie.insert("someWord");

        WHEN: {}
        var actual = trie.search("someWord");

        THEN: {}
        assertThat(actual).isTrue();
    }
}