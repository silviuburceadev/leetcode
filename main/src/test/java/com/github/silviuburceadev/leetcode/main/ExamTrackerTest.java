package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ExamTrackerTest {

    /**
     * TODO refactor this test, do not add multiple asserts
     */
    @Test
    void baseCases() {
        final var examTracker = new ExamTracker();
        examTracker.record(1, 98);

        assertThat(examTracker.totalScore(1, 1)).isEqualTo(98);

        examTracker.record(5, 99);
        assertThat(examTracker.totalScore(1, 3)).isEqualTo(98);
        assertThat(examTracker.totalScore(1, 5)).isEqualTo(197);
        assertThat(examTracker.totalScore(3, 4)).isEqualTo(0);
        assertThat(examTracker.totalScore(2, 5)).isEqualTo(99);
    }
}
