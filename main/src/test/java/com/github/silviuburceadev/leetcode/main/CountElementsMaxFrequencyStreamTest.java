package com.github.silviuburceadev.leetcode.main;

class CountElementsMaxFrequencyStreamTest implements CountElementsMaxFrequencyTest {

    @Override
    public CountElementsMaxFrequency getImpl() {
        return new CountElementsMaxFrequencyStream();
    }
}
