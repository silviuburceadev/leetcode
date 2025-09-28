package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.ArrayList;
import java.util.List;

@Problem(3697)
public class DecimalRepresentation {

    public int[] decimalRepresentation(int n) {
        List<Integer> components = new ArrayList<>();
        int powerOfTen = 1;
        while (n != 0) {
            int rem = n % 10;
            if (rem != 0) {
                components.add(rem * powerOfTen);
            }
            powerOfTen *= 10;
            n /= 10;
        }

        // stream is slower, building the final result manually
        // return components.stream().sorted(Comparator.reverseOrder()).mapToInt(x -> x).toArray();
        int[] result = new int[components.size()];
        for (int i = components.size() - 1, index = 0; i >= 0; i--, index++) {
            result[index] = components.get(i);
        }
        return result;
    }
}
