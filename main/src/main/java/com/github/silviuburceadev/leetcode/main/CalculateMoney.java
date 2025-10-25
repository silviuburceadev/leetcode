package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(1716)
public class CalculateMoney {

    public int totalMoney(int n) {
        // 1 + 2 + 3 + 4 + 5 + 6 + 7
        var wholeAmount = 28;
        // whole weeks
        var wholeWeeks = n / 7;

        var total = 0;
        // each week, there is extra 7 deposited, so we have 28, 28 + 7, 28 + 14, this counts 0 + 7 + 14 + ...
        total = wholeAmount * wholeWeeks + 7 * (wholeWeeks - 1) * wholeWeeks / 2;
        // last days
        total += (wholeWeeks + n % 7) * (wholeWeeks + n % 7 + 1) / 2 - wholeWeeks * (wholeWeeks + 1) / 2;

        return total;
    }
}
