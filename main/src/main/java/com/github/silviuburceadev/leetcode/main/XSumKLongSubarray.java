package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;
import com.github.silviuburceadev.leetcode.core.meta.Revisit;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

@Problem(3318)
@Revisit("Try to find a better way to sort frequencies, e.g. array, due to limited value range in nums")
public class XSumKLongSubarray {

    private static final Comparator<Map.Entry<Integer, Long>> BY_VALUE_DESC_BY_KEY_DESC =
            Map.Entry.<Integer, Long>comparingByValue()
                    .reversed()
                    .thenComparing(Map.Entry.<Integer, Long>comparingByKey().reversed());

    public int[] findXSum(int[] nums, int k, int x) {
        var res = new int[nums.length - k + 1];

        var frequency = Arrays.stream(nums)
                .boxed()
                .limit(k)
                .collect(groupingBy(identity(), counting()));

        for (var i = 0; i < nums.length - k + 1; i++) {
            res[i] = xSum(frequency, x);
            // remove current element, add the k-th element from current index
            frequency.put(nums[i], frequency.getOrDefault(nums[i], 0L) - 1);
            if (i + k == nums.length) continue;
            frequency.put(nums[i + k], frequency.getOrDefault(nums[i + k], 0L) + 1);
        }

        return res;
    }

    private int xSum(Map<Integer, Long> frequency, int x) {
        return frequency.entrySet()
                .stream()
                .sorted(BY_VALUE_DESC_BY_KEY_DESC)
                .limit(x)
                .mapToInt(e -> e.getKey() * e.getValue().intValue())
                .sum();
    }
}
