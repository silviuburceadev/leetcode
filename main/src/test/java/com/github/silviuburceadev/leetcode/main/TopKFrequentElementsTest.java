package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class TopKFrequentElementsTest {

    private static final TopKFrequentElements IMPL = new TopKFrequentElements();

    @ParameterizedTest
    @MethodSource("topKFrequentSource")
    void topKFrequent(int[] nums, int k, int[] expected) {
        // when
        var actual = IMPL.topKFrequent(nums, k);

        assertThat(actual).containsExactlyInAnyOrder(expected);

    }

    private static Stream<Arguments> topKFrequentSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 1, 1, 2, 2, 3 }, 2, new int[] { 1, 2 }))
                .add(Arguments.of(new int[] { 1 }, 1, new int[] { 1 }))
                .add(Arguments.of(new int[] { 1, 2, 1, 2, 1, 2, 3, 1, 3, 2 }, 2, new int[] { 1, 2 }))
                .add(Arguments.of(new int[] { 3, 0, 1, 0 }, 1, new int[] { 0 }))
                .build();
    }
}
