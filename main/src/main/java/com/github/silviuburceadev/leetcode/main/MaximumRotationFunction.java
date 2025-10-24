package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

import java.util.Arrays;

@Problem(396)
public class MaximumRotationFunction {

    public int maxRotateFunction(int[] nums) {
        var sum = Arrays.stream(nums).sum();
        var total = sumProduct(nums);

        var current = total;
        var max = total;

        for (var i = 1; i < nums.length; i++) {
            current = rotate(current, sum, nums, i);
            max = Math.max(max, current);
        }

        return max;
    }

    private int sumProduct(int[] nums) {
        var res = 0;

        for (var i = 1; i < nums.length; i++) {
            res += i * nums[i];
        }

        return res;
    }

    /**
     * By going from F(k - 1) to F(k), all numbers would be added once, except for the <code>k</code>-th from the tail,
     * which would have to be removed from the sum. As it originally contributed to the overall rotation by
     * <code>nums.length - 1</code> times, we can still add it with rest of the numbers, essentially adding the sum of
     * the initial numbers, but have to subtract it once more, for <code>nums.length</code> times.
     * <p>
     * e.g. For (4, 3, 2, 6):
     * F(0) = 0 * 4 + 1 * 3 + 2 * 2 + 3 * 6
     * For F(1), all numbers get added once, e.g. their coefficient increases by 1, except for 6, for which its coefficient
     * goes from 3 (which is <code>nums.length - 1</code>) to 0.
     * F(1) = (0 + 1) * 4 + (1 + 1) * 3 + (2 + 1) * 2 + (3 - 3) * 6
     * By adding 6 to F(1) once, we're essentially adding all the numbers from the initial array once, but we have to
     * also subtract 6 once more, so for <code>nums.length</code> times
     * subtract it.
     * F(1) = (0 + 1) * 4 + (1 + 1) * 3 + (2 + 1) * 2 + (3 + 1 - 4) * 6
     *
     * @param current the current rotation, F(k - 1)
     * @param sum     the sum of numbers in nums
     * @param nums    the starting numbers
     * @param k       the number of rotation
     * @return the next rotation, F(k)
     */
    private int rotate(int current, int sum, int[] nums, int k) {
        return current + sum - nums.length * nums[nums.length - k];
    }
}
