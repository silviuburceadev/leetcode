package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;

@Problem(11)
public class ContainerMostWater {

    public int maxArea(int[] height) {
        var result = 0;

        // going inwards
        var left = 0;
        var right = height.length - 1;
        while (left < right) {
            var area = (right - left) * Math.min(height[left], height[right]);
            result = Math.max(result, area);

            if (height[left] < height[right]) left++;
            else right--;
        }

        return result;
    }
}
