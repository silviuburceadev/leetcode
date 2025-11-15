package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.MatrixUtils;
import com.github.silviuburceadev.leetcode.core.meta.Problem;
import com.github.silviuburceadev.leetcode.core.meta.Revisit;

@Problem(1886)
@Revisit({
        "Is there a better way? If so, is it worth the trade-off compared to code readability?",
        "Add support for non-square matrix"
})
public class VerifyMatrixRotation {

    public boolean findRotation(int[][] mat, int[][] target) {
        int rotation = 0;
        do {
            if (MatrixUtils.equals(mat, target)) return true;

            MatrixUtils.rotate(mat);
            rotation += 90;
        } while (rotation < 360);

        return false;
    }
}
