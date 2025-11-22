package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LexicographicallySmallestNegativePermutationTest {

    private static final LexicographicallySmallestNegativePermutation IMPL = new LexicographicallySmallestNegativePermutation();

    @ParameterizedTest
    @MethodSource("lexSmallestNegatedPermSource")
    void lexSmallestNegatedPerm(int n, long target, int[] expected) {
        // when
        var actual = IMPL.lexSmallestNegatedPerm(n, target);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> lexSmallestNegatedPermSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(3, 0, new int[] { -3, 1, 2 }))
                .add(Arguments.of(2, 1, new int[] { -1, 2 }))
                .add(Arguments.of(1, 10_000_000_000L, new int[0]))
                .build();
    }
}
