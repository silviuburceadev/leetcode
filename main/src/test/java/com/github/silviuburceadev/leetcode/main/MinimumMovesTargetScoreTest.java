package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinimumMovesTargetScoreTest {

    private static final MinimumMovesTargetScore IMPL = new MinimumMovesTargetScore();

    @ParameterizedTest
    @MethodSource("minMovesSource")
    void minMoves(int target, int maxDoubles, int expected) {
        // when
        var actual = IMPL.minMoves(target, maxDoubles);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> minMovesSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(5, 0, 4))
                .add(Arguments.of(19, 2, 7))
                .add(Arguments.of(10, 4, 4))
                .add(Arguments.of(1_000_000_000, 0, 999_999_999))
                .add(Arguments.of(1024, 10, 10))
                .build();
    }
}
