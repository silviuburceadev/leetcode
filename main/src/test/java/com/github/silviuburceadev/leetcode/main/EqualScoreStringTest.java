package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualScoreStringTest {

    private static final EqualScoreString IMPL = new EqualScoreString();

    @Test
    void equalSplit() {
        GIVEN: {}
        var input = "adbc";

        WHEN: {}
        var actual = IMPL.scoreBalance(input);

        THEN: {}
        assertThat(actual).isTrue();
    }


    @Test
    void noSplit() {
        GIVEN: {}
        var input = "bace";

        WHEN: {}
        var actual = IMPL.scoreBalance(input);

        THEN: {}
        assertThat(actual).isFalse();
    }
}
