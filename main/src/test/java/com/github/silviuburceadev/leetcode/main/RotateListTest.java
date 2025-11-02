package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.model.ListNode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.github.silviuburceadev.leetcode.core.model.ListNode.fromNumbers;
import static org.assertj.core.api.Assertions.assertThat;

class RotateListTest {

    private static final RotateList IMPL = new RotateList();

    @ParameterizedTest
    @MethodSource("rotateRightSource")
    void rotateRight(ListNode head, int k, ListNode expected) {
        // given
        var actual = IMPL.rotateRight(head, k);

        // then
        assertThat(actual).isEqualTo(expected);
    }

    private static Stream<Arguments> rotateRightSource() {
        return Stream.<Arguments>builder()
                .add(Arguments.of(fromNumbers(1, 2, 3, 4, 5), 2, fromNumbers(4, 5, 1, 2, 3)))
                .add(Arguments.of(fromNumbers(0, 1, 2), 4, fromNumbers(2, 0, 1)))
                // 0-size
                .add(Arguments.of(null, 4, null))
                // 1-size
                .add(Arguments.of(fromNumbers(0), 4, fromNumbers(0)))
                // 2-size
                .add(Arguments.of(fromNumbers(0, 1), 3, fromNumbers(1, 0)))
                // k much larger than list's size
                .add(Arguments.of(fromNumbers(1, 2, 3, 4, 5), 100_002, fromNumbers(4, 5, 1, 2, 3)))
                .build();
    }
}
