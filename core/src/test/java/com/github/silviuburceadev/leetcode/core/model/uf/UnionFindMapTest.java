package com.github.silviuburceadev.leetcode.core.model.uf;

public class UnionFindMapTest implements UnionFindTest {

    @Override
    public UnionFind<String> getImpl() {
        return new UnionFindMap<>();
    }
}