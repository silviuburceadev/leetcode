package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BinaryPrefixDivisibleByFiveTest {

    private static final BinaryPrefixDivisibleByFive IMPL = new BinaryPrefixDivisibleByFive();

    @ParameterizedTest
    @MethodSource("prefixesDivBy5Source")
    void prefixesDivBy5(int[] nums, List<Boolean> expected) {
        // when
        var actual = IMPL.prefixesDivBy5(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> prefixesDivBy5Source() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 0, 1, 1 }, List.of(true, false, false)))
                .add(Arguments.of(new int[] { 1, 1, 1 }, List.of(false, false, false)))
                .build();
    }
}
