package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class MissingElementsTest {

    private static final MissingElements IMPL = new MissingElements();

    @ParameterizedTest
    @MethodSource("findMissingElementsSource")
    void findMissingElements(int[] nums, List<Integer> expected) {
        // when
        var actual = IMPL.findMissingElements(nums);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> findMissingElementsSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 2, 4, 5 }, List.of(3)))
                .add(Arguments.of(new int[] { 7, 8, 6, 9 }, List.of()))
                .add(Arguments.of(new int[] { 5, 1 }, List.of(2, 3, 4)))
                .build();
    }
}
