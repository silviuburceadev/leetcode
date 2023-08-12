package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveElementTest {

    private static final RemoveElement impl = new RemoveElement();

    @Test
    public void testElementNotFound() {
        GIVEN: {}
        int[] nums = new int[] { 5, 1, 3, 7, 9, 7 };
        int val = 4;
        int[] expectedNums = new int[] { 1, 3, 5, 7, 7, 9 };
        WHEN: {}
        int k = impl.removeElement(nums, val);
        THEN: {}
        Assertions.assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        for (var i = 0; i < k; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }
}
