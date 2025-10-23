package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PostSubstitutionValidWordTest {

    private static final PostSubstitutionValidWord IMPL = new PostSubstitutionValidWord();

    @ParameterizedTest
    @MethodSource("testIsValidSource")
    void testIsValid(String s, boolean expected) {
        // when
        var actual = IMPL.isValid(s);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testIsValidSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("aabcbc", true))
                .add(Arguments.of("abcabcababcc", true))
                .add(Arguments.of("abccba", false))
                .build();
    }
}
