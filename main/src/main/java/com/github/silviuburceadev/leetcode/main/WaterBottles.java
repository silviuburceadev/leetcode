package com.github.silviuburceadev.leetcode.main;

public class WaterBottles {

    public int numWaterBottles(int numBottles, int numExchange) {
        var total = 0;
        var emptyBottles = 0;

        while (numBottles >= 1) {
            total += numBottles;
            numBottles += emptyBottles;
            emptyBottles = numBottles % numExchange;
            numBottles /= numExchange;
        }

        return total;
    }
}
