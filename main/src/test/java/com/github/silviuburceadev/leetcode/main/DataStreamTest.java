package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class DataStreamTest {

    @Nested
    class DataStreamTestCase {
        private static DataStream dataStream;

        @BeforeAll
        static void setup() {
            dataStream = new DataStream(4, 3);
        }

        @ParameterizedTest
        @MethodSource("dataStreamSource")
        void dataStream(int num, boolean expected) {
            assertThat(dataStream.consec(num)).isEqualTo(expected);
        }

        private static Stream<Arguments> dataStreamSource() {
            return Stream.<Arguments>builder()
                    .add(Arguments.of(4, false))
                    .add(Arguments.of(4, false))
                    .add(Arguments.of(4, true))
                    .add(Arguments.of(4, true))
                    .add(Arguments.of(3, false))
                    .build();
        }
    }
}
