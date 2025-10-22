package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class ValidParenthesisTest {

    private static final ValidParenthesis IMPL = new ValidParenthesis();

    @ParameterizedTest
    @MethodSource("testIsValidSource")
    void testIsValid(String input, boolean expected) {
        // when
        var actual = IMPL.isValid(input);

        // then
        assertThat(actual).isEqualTo(expected);

    }

    public static Stream<Arguments> testIsValidSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("()", true))
                .add(Arguments.of("()[]{}", true))
                .add(Arguments.of("(]", false))
                .add(Arguments.of("([])", true))
                .add(Arguments.of("([)]", false))
                .add(Arguments.of("())", false))
                .build();
    }
}
