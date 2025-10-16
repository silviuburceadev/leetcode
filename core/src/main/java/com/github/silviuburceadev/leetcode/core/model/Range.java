package com.github.silviuburceadev.leetcode.core.model;

public record Range(int start, int end) {

    public int size() {
        return end - start;
    }
}
