package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.MatrixUtils;
import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(48)
public class RotateImage {

    public void rotate(int[][] matrix) {
        MatrixUtils.transpose(matrix);
        MatrixUtils.horizontalFlip(matrix);
    }
}
