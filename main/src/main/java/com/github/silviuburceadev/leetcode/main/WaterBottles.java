package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

public class WaterBottles {

    @Problem(1518)
    public int numWaterBottles(int numBottles, int numExchange) {
        var total = 0;
        var emptyBottles = 0;

        while (numBottles != 0) {
            total += numBottles;
            numBottles += emptyBottles;
            emptyBottles = numBottles % numExchange;
            numBottles /= numExchange;
        }

        return total;
    }

    @Problem(3100)
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        var total = 0;
        var emptyBottles = 0;
        while (numBottles != 0 || emptyBottles >= numExchange) {
            total += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;

            if (emptyBottles >= numExchange) {
                emptyBottles -= numExchange;
                numBottles++;
                numExchange++;
            }
        }

        return total;
    }
}
