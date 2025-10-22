package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AddSpacesTest {

    private static final AddSpaces IMPL = new AddSpaces();

    @ParameterizedTest
    @MethodSource("testAddSpacesSource")
    void testAddSpaces(String s, int[] spaces, String expected) {
        // when
        var actual = IMPL.addSpaces(s, spaces);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    public static Stream<Arguments> testAddSpacesSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("EnjoyYourCoffee", new int[] { 5, 9 }, "Enjoy Your Coffee"))
                .add(Arguments.of("LeetcodeHelpsMeLearn", new int[] { 8, 13, 15 }, "Leetcode Helps Me Learn"))
                .add(Arguments.of("icodeinpython", new int[] { 1, 5, 7, 9 }, "i code in py thon"))
                .add(Arguments.of("spacing", new int[] { 0, 1, 2, 3, 4, 5, 6 }, " s p a c i n g"))
                .build();
    }
}
