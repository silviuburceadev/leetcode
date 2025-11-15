package com.github.silviuburceadev.leetcode.core;

import java.util.Arrays;

public final class MatrixUtils {

    private MatrixUtils() {
        // Utility class
    }

    public static void rotate(int[][] matrix) {
        MatrixUtils.transpose(matrix);
        MatrixUtils.horizontalFlip(matrix);
    }


    public static void transpose(int[][] matrix) {
        for (var row : matrix) {
            if (row.length != matrix.length) return;
        }
        for (var i = 0; i < matrix.length; i++) {
            for (var j = i; j < matrix[i].length; j++) {
                var t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
    }

    public static void horizontalFlip(int[][] matrix) {
        if (matrix.length == 0) return;
        var length = matrix[0].length;
        for (var rows : matrix) {
            if (rows.length != length) return;
        }

        for (var row : matrix) {
            ArrayUtils.reverse(row);
        }
    }

    public static boolean equals(int[][] left, int[][] right) {
        if (left.length != right.length) return false;
        for (var i = 0; i < left.length; i++) {
            if (!Arrays.equals(left[i], right[i])) return false;
        }

        return true;
    }
}
