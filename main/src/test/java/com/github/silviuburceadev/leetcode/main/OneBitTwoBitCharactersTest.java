package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class OneBitTwoBitCharactersTest {

    private static final OneBitTwoBitCharacters IMPL = new OneBitTwoBitCharacters();

    @ParameterizedTest
    @MethodSource("isOneBitCharacterSource")
    void isOneBitCharacter(int[] bits, boolean expected) {
        // when
        var actual = IMPL.isOneBitCharacter(bits);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> isOneBitCharacterSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(new int[] { 1, 0, 0 }, true))
                .add(Arguments.of(new int[] { 1, 1, 1, 0 }, false))
                .add(Arguments.of(new int[] { 1, 1, 1, 1, 0 }, true))
                .add(Arguments.of(new int[] { 1, 0, 1, 1, 1, 0 }, false))
                .add(Arguments.of(new int[] { 1, 0, 0, 1, 1, 1, 0 }, false))
                .add(Arguments.of(new int[] { 1, 0, 0, 1, 0, 1, 1, 0 }, true))
                .build();
    }
}
