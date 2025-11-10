package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(2139)
public class MinimumMovesTargetScore {

    public int minMoves(int target, int maxDoubles) {
        var result = 0;
        while (target > 1) {
            if (maxDoubles == 0) {
                return result + target - 1;
            }

            maxDoubles = target % 2 == 0 ? maxDoubles - 1 : maxDoubles;
            target = target % 2 == 0 ? target / 2 : target - 1;

            result++;
        }

        return result;
    }
}
