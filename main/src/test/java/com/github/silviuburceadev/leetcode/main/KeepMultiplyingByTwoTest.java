package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class KeepMultiplyingByTwoTest {

    private static final KeepMultiplyingByTwo IMPL = new KeepMultiplyingByTwo();

    @ParameterizedTest
    @MethodSource("findFinalValueSource")
    void findFinalValue(int[] nums, int original, int expected) {
        // when
        var actual = IMPL.findFinalValue(nums, original);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> findFinalValueSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 5, 3, 6, 1, 12 }, 3, 24))
                .add(Arguments.of(new int[] { 2, 7, 9 }, 4, 4))
                .build();
    }
}
