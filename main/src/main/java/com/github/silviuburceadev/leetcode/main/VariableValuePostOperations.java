package com.github.silviuburceadev.leetcode.main;

import java.util.Arrays;
import java.util.function.ToIntFunction;

public class VariableValuePostOperations {

    private static final ToIntFunction<String> OPERATION_TO_VALUE = op -> switch (op) {
        case "X++", "++X" -> 1;
        case "X--", "--X" -> -1;
        case null -> 0;
        // should not happen, but let's skip it
        default -> 0;
    };

    public int finalValueAfterOperations(String[] operations) {
        return Arrays.stream(operations).mapToInt(OPERATION_TO_VALUE).sum();
    }
}
