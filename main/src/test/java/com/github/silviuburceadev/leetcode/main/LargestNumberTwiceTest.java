package com.github.silviuburceadev.leetcode.main;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class LargestNumberTwiceTest {

    private static final LargestNumberTwice IMPL = new LargestNumberTwice();

    @Test
    void checkInputIsNotLongEnough() {
        GIVEN: {}
        var input = new int[] { 1 };

        WHEN: {}
        var actual = IMPL.dominantIndex(input);

        THEN: {}
        assertThat(actual).isEqualTo(-1);
    }

    @Test
    void checkLargestIsNotDominant() {
        GIVEN: {}
        var input = new int[] { 1, 2, 3, 4 };

        WHEN: {}
        var actual = IMPL.dominantIndex(input);

        THEN: {}
        assertThat(actual).isEqualTo(-1);
    }

    @Test
    void checkLargestIsDominant() {
        GIVEN: {}
        var input = new int[] { 3, 6, 1, 0 };

        WHEN: {}
        var actual = IMPL.dominantIndex(input);

        THEN: {}
        assertThat(actual).isEqualTo(1);
    }

    @Test
    void checkLargestIsDominantInFirstPosition() {
        GIVEN: {}
        var input = new int[] { 1, 0 };

        WHEN: {}
        var actual = IMPL.dominantIndex(input);

        THEN: {}
        assertThat(actual).isEqualTo(0);
    }
}
