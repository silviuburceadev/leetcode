package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class LongestBalancedSubstringTest {

    private static final LongestBalancedSubstring IMPL = new LongestBalancedSubstring();

    private static Stream<Arguments> testCases() {
        return Stream.<Arguments>builder()
                .add(Arguments.of("abbac", 4))
                .add(Arguments.of("zzabccy", 4))
                .add(Arguments.of("aba", 2))
                .add(Arguments.of("lnolonnlkkmonommlklmkknmkknnkllmlnnmklnlmnlkmlnmoomolonoolmklnnolkmlomnkmnmllonmokknokoknknkknomlnklnnklmmmkmkkmlknmmnlokoklmlonmnmlnlknomooonlknkmmon", 35))
                .add(Arguments.of("tpsprrrtrqqtsqqtsqrrprrsqprqtstqsrstprqqprprrstqrtspsqrrrprpsqtssprtqpqstsqqpqpssstqrrtqprtptpsqtrrsrtqsqrpsrtstrpqprqqprrsrprpssprrtsqpprtqrqtrtqsppttttprq", 25))
                .build();
    }

    @ParameterizedTest
    @MethodSource("testCases")
    void baseCases(String input, int expected) {
        WHEN: {}
        final var actual = IMPL.longestBalanced(input);

        THEN: {}
        assertThat(actual).isEqualTo(expected);
    }
}
