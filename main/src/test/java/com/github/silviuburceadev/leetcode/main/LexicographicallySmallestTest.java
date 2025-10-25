package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LexicographicallySmallestTest {

    private static final LexicographicallySmallest IMPL = new LexicographicallySmallest();

    @ParameterizedTest
    @MethodSource("testLexSmallestSource")
    void testLexSmallest(String s, String expected) {
        // when
        var actual = IMPL.lexSmallest(s);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testLexSmallestSource() {
        return Stream.<Arguments>builder()
                // rotate left, 2
                .add(Arguments.of("dcab", "acdb"))
                // rotate right, 1
                .add(Arguments.of("abba", "aabb"))
                // rotate left, 2
                .add(Arguments.of("zxy", "xzy"))
                // rotate right, 0
                .add(Arguments.of("zxya", "ayxz"))
                // rotate right, 0
                .add(Arguments.of("a", "a"))
                // rotate left, 1
                .add(Arguments.of("kl", "kl"))
                // rotate right, 0
                .add(Arguments.of("ss", "ss"))
                // rotate right, 1
                .add(Arguments.of("knm", "kmn"))
                // rotate right, 2
                .add(Arguments.of("kkm", "kkm"))
                // rotate right, 2
                .add(Arguments.of("kkml", "kklm"))
                // rotate right, 2
                .add(Arguments.of("kkmk", "kkkm"))
                // rotate left, 1
                .add(Arguments.of("kmko", "kmko"))
                .build();
    }
}
