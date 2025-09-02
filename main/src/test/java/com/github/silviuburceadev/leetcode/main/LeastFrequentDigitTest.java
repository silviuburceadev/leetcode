package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LeastFrequentDigitTest {

    private static final LeastFrequentDigit IMPL = new LeastFrequentDigit();

    /// base case for single digit numbers
    @Test
    void singleDigitNumber() {
        GIVEN: {}
        var number = 1;
        var expected = 1;

        WHEN: {}
        var actual = IMPL.getLeastFrequentDigit(number);

        THEN: {}
        assertThat(actual).isEqualTo(expected);
    }

    /// 1 is the least freq. digit
    @Test
    void singleDigitLeastFrequent() {
        GIVEN: {}
        var number = 1553322;
        var expected = 1;

        WHEN: {}
        var actual = IMPL.getLeastFrequentDigit(number);

        THEN: {}
        assertThat(actual).isEqualTo(expected);
    }

    /// 7, 2 and 5 all appear once, but 2 is the minimum.
    @Test
    void multiDigitLeastFrequent() {
        GIVEN: {}
        var number = 723344511;
        var expected = 2;

        WHEN: {}
        var actual = IMPL.getLeastFrequentDigit(number);

        THEN: {}
        assertThat(actual).isEqualTo(expected);
    }

}
