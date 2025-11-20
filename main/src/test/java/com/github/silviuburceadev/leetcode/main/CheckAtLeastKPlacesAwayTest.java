package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class CheckAtLeastKPlacesAwayTest {

    private static final CheckAtLeastKPlacesAway IMPL = new CheckAtLeastKPlacesAway();

    @ParameterizedTest
    @MethodSource("kLengthApartSource")
    void kLengthApart(int[] nums, int k, boolean expected) {
        // when
        var actual = IMPL.kLengthApart(nums, k);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> kLengthApartSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 0, 0, 0, 1, 0, 0, 1 }, 2, true))
                .add(Arguments.of(new int[] { 1, 0, 0, 1, 0, 1 }, 2, false))
                .build();
    }
}
