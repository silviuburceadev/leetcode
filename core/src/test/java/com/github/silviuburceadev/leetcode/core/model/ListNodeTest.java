package com.github.silviuburceadev.leetcode.core.model;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.github.silviuburceadev.leetcode.core.model.ListNode.fromNumbers;
import static org.assertj.core.api.Assertions.assertThat;

class ListNodeTest {

    @ParameterizedTest
    @MethodSource("equalsSource")
    void testEquals(ListNode left, Object right, boolean expected) {
        assertThat(left.equals(right)).isEqualTo(expected);
    }

    private static Stream<Arguments> equalsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(fromNumbers(1, 2, 3), new Object(), false))
                .add(Arguments.of(fromNumbers(1, 2, 3), fromNumbers(1, 2), false))
                .add(Arguments.of(fromNumbers(1, 2), fromNumbers(1, 2, 3), false))
                .add(Arguments.of(fromNumbers(1, 2), fromNumbers(2, 3), false))
                .add(Arguments.of(fromNumbers(1, 2, 3), fromNumbers(1, 2, 3), true))
                .build();
    }
}
