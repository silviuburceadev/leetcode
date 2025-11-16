package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinStringAfterBalancedRemovalsTest {

    private static final MinStringAfterBalancedRemovals IMPL = new MinStringAfterBalancedRemovals();

    @ParameterizedTest
    @MethodSource("minLengthAfterRemovalsSource")
    void minLengthAfterRemovals(String s, int expected) {
        // when
        var actual = IMPL.minLengthAfterRemovals(s);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> minLengthAfterRemovalsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("aabbab", 0))
                .add(Arguments.of("aaaa", 4))
                .add(Arguments.of("aaabb", 1))
                .add(Arguments.of("bbaa", 0))
                .build();
    }
}
