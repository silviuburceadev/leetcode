package com.github.silviuburceadev.leetcode.main;

public class RotateArrayMemoryTest implements RotateArrayTest {

    @Override
    public RotateArray getImpl() {
        return new RotateArrayMemory();
    }
}
