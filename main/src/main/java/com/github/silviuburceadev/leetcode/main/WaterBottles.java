package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

public class WaterBottles {

    @Problem(1518)
    public int numWaterBottles(int numBottles, int numExchange) {
        return drinkExchange(numBottles, numExchange, 0);
    }

    @Problem(3100)
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        return drinkExchange(numBottles, numExchange, 1);
    }

    private int drinkExchange(int numBottles, int numExchange, int priceIncrease) {
        var total = 0;
        var emptyBottles = 0;
        while (numBottles != 0) {
            total += numBottles;
            emptyBottles += numBottles;
            numBottles = 0;

            while (emptyBottles >= numExchange) {
                emptyBottles -= numExchange;
                numBottles++;
                numExchange += priceIncrease;
            }
        }

        return total;
    }
}
