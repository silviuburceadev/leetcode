package com.github.silviuburceadev.leetcode.main;

import java.util.ArrayList;
import java.util.List;

record ExamResult(int time, int score) {}

public final class ExamTracker {

    private final List<ExamResult> examResults = new ArrayList<>();

    public ExamTracker() {}

    public void record(int time, int score) {
        examResults.add(new ExamResult(time, score));
    }

    public long totalScore(int startTime, int endTime) {
        return examResults.stream()
                .dropWhile(exam -> exam.time() < startTime)
                .takeWhile(exam -> exam.time() <= endTime)
                .mapToLong(ExamResult::score)
                .sum();
    }
}
