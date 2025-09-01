package com.github.silviuburceadev.leetcode.core.model.tree;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(208)
public class Trie {

    private final TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    // TODO SB retrofit find and use it here
    public void insert(String word) {
        var node = root;

        for (char c : word.toCharArray()) {
            var index = c - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }

        node.isEnd = true;
    }

    public boolean search(String word) {
        var node = find(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return find(prefix) != null;
    }

    private TrieNode find(String prefix) {
        var node = this.root;

        for (char c : prefix.toCharArray()) {
            var index = c - 'a';
            node = node.children[index];
            if (node == null) return null;
        }

        return node;
    }

    public static final class TrieNode {
        /**
         * Size of the trie.
         * TODO SB Provide an alphabet to make it dynamic.
         */
        public static final int SIZE = 26;

        private boolean isEnd;
        private final TrieNode[] children;

        public TrieNode() {
            children = new TrieNode[SIZE];
        }
    }
}

