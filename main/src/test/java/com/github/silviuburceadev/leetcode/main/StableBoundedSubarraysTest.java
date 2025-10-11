package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class StableBoundedSubarraysTest {

    private static final StableBoundedSubarrays IMPL = new StableBoundedSubarrays();

    @ParameterizedTest
    @MethodSource("countStableSubarraysSource")
    void countStableSubarrays(int[] capacity, long expected) {
        // when
        var actual = IMPL.countStableSubarrays(capacity);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> countStableSubarraysSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 9, 3, 3, 3, 9 }, 2))
                .add(Arguments.of(new int[] { 1, 2, 3, 4, 5 }, 0))
                .add(Arguments.of(new int[] { 0, 0, 0, 0 }, 3))
                .add(Arguments.of(new int[] { 4, -16, 12, 4, 4, 4, 12, -16, 4, 0 }, 5))
                .add(Arguments.of(new int[] {
                        0, 0, 0, 0, 0, 0, 0, 0, -3, -3,
                                -3, 0, -12, -4, -4, -4, -12, 0, 0, 0,
                        0, 0, 0, 0, -5, -5, -5
                                },
                        40
                        )
                )
                .add(Arguments.of(new int[] { 0, 0, 0, 1, -1, 0 }, 4))
                .build();
    }
}
