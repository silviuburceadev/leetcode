package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(717)
public class OneBitTwoBitCharacters {

    public boolean isOneBitCharacter(int[] bits) {
        var isTwoBits = false;
        var isOneBit = false;

        for (var bit: bits) {
            if (isTwoBits) {
                isTwoBits = false;
                isOneBit = false;
                continue;
            }
            isTwoBits = bit == 1;
            isOneBit = true;
        }

        return isOneBit;
    }
}
