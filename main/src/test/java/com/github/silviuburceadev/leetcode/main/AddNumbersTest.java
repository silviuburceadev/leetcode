package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.model.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class AddNumbersTest {

    private static final AddNumbers IMPL = new AddNumbers();

    @ParameterizedTest
    @MethodSource("testAddTwoNumbersSource")
    void testAddTwoNumbers(ListNode l1, ListNode l2, ListNode expected) {
        // when
        var actual = IMPL.addTwoNumbers(l1, l2);

        // then
        assertThat(actual.toString()).isEqualTo(expected.toString());
    }

    private static Stream<Arguments> testAddTwoNumbersSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(ListNode.fromNumber(342), ListNode.fromNumber(465), ListNode.fromNumber(807)))
                .add(Arguments.of(ListNode.fromNumber(0), ListNode.fromNumber(0), ListNode.fromNumber(0)))
                .add(Arguments.of(ListNode.fromNumber(99), ListNode.fromNumber(12), ListNode.fromNumber(111)))
                .add(Arguments.of(ListNode.fromNumber(9_999_999), ListNode.fromNumber(9_999), ListNode.fromNumber(10_009_998)))
                .add(Arguments.of(ListNode.fromNumber(9_999), ListNode.fromNumber(9_999_999), ListNode.fromNumber(10_009_998)))
                .build();
    }

}