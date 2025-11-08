package com.github.silviuburceadev.leetcode.main;

public class MinMovesEqualArrayElementsStreamTest implements MinMovesEqualArrayElementsTest {

    @Override
    public MinMovesEqualArrayElements getImpl() {
        return new MinMovesEqualArrayElementsStream();
    }
}
