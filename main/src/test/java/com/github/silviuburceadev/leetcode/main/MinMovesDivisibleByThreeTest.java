package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MinMovesDivisibleByThreeTest {

    private static final MinMovesDivisibleByThree IMPL = new MinMovesDivisibleByThree();

    @ParameterizedTest
    @MethodSource("minimumOperationsSource")
    void minimumOperations(int[] nums, int expected) {
        // when
        var actual = IMPL.minimumOperations(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> minimumOperationsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 3, 4 }, 3))
                .add(Arguments.of(new int[] { 3, 6, 9 }, 0))
                .build();
    }
}
