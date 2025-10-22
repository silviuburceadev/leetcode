package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class BoxCriteriaTest {

    private static final BoxCriteria IMPL = new BoxCriteria();

    @ParameterizedTest
    @MethodSource("testCategorizeBoxSource")
    void testCategorizeBox(int length, int width, int height, int mass, String expected) {
        // when
        var actual = IMPL.categorizeBox(length, width, height, mass);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testCategorizeBoxSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(1000, 35, 700, 300, "Heavy"))
                .add(Arguments.of(200, 50, 800, 50, "Neither"))
                .add(Arguments.of(1000, 1000, 1000, 1000, "Both"))
                .add(Arguments.of(2909, 3968, 3272, 727, "Both"))
                .add(Arguments.of(2909, 3968, 3272, 50, "Bulky"))
                .add(Arguments.of(10_000, 10, 10, 50, "Bulky"))
                .add(Arguments.of(1_000, 10_000, 10, 50, "Bulky"))
                .add(Arguments.of(1_000, 1_000, 10_000, 50, "Bulky"))
                .build();
    }
}
