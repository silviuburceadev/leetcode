package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.model.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.github.silviuburceadev.leetcode.core.model.ListNode.fromDigits;
import static org.assertj.core.api.Assertions.assertThat;

class AddNumbersTest {

    private static final AddNumbers IMPL = new AddNumbers();

    @ParameterizedTest
    @MethodSource("testAddTwoNumbersSource")
    void testAddTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
        // when
        var actual = IMPL.addTwoNumbers(l1, l2);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> testAddTwoNumbersSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(fromDigits(342), fromDigits(465), fromDigits(807)))
                .add(Arguments.of(fromDigits(0), fromDigits(0), fromDigits(0)))
                .add(Arguments.of(fromDigits(99), fromDigits(12), fromDigits(111)))
                .add(Arguments.of(fromDigits(9_999_999), fromDigits(9_999), fromDigits(10_009_998)))
                .add(Arguments.of(fromDigits(9_999), fromDigits(9_999_999), fromDigits(10_009_998)))
                .add(Arguments.of(fromDigits(9_999), null, fromDigits(9_999)))
                .add(Arguments.of(null, fromDigits(9_999), fromDigits(9_999)))
                .build();
    }
}
