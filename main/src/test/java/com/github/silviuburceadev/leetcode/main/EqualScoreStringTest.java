package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class EqualScoreStringTest {

    private static final EqualScoreString IMPL = new EqualScoreString();

    @Test
    void equalSplit() {
        // given
        var input = "adbc";

        // when
        var actual = IMPL.scoreBalance(input);

        // then
        assertThat(actual).isTrue();
    }


    @Test
    void unevenTotal() {
        // given
        var input = "bace";

        // when
        var actual = IMPL.scoreBalance(input);

        // then
        assertThat(actual).isFalse();
    }

    @Test
    void notEqualSplit() {
        // given
        var input = "bacd";

        // when
        var actual = IMPL.scoreBalance(input);

        // then
        assertThat(actual).isFalse();
    }
}
