package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;
import com.github.silviuburceadev.leetcode.core.meta.Revisit;

import java.util.ArrayList;
import java.util.List;

@Problem(3709)
@Revisit("TLE")
public final class ExamTracker {

    record ExamResult(int time, int score) {}

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
