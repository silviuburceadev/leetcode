package com.github.silviuburceadev.leetcode.main;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class RemoveElementTest {

    private static final RemoveElement impl = new RemoveElement();

    @Test
    public void testElementNotFound() {
        GIVEN: {}
        final int[] nums = new int[] { 5, 1, 3, 7, 9, 7 };
        final int val = 4;
        int[] expectedNums = new int[] { 1, 3, 5, 7, 7, 9 };
        WHEN: {}
        final int k = impl.removeElement(nums, val);
        THEN: {}
        Assertions.assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        for (var i = 0; i < k; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testElementOnFirstPosition() {
        GIVEN: {}
        final int[] nums = new int[] { 5, 1, 3, 7, 9, 7 };
        final int val = nums[0];
        final int[] expectedNums = new int[] { 1, 3, 7, 7, 9 };
        WHEN: {}
        final int k = impl.removeElement(nums, val);
        THEN: {}
        Assertions.assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        for (var i = 0; i < k; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void testElementOnLastPosition() {
        GIVEN: {}
        final int[] nums = new int[] { 5, 1, 3, 7, 9, 7, 11 };
        final int val = nums[nums.length - 1];
        final int[] expectedNums = new int[] { 1, 3, 5, 7, 7, 9 };
        WHEN: {}
        final int k = impl.removeElement(nums, val);
        THEN: {}
        Assertions.assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        for (var i = 0; i < k; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }
    @Test
    public void testElementIsRepeated() {
        GIVEN: {}
        final int[] nums = new int[] { 7, 5, 1, 3, 6, 7, 2, 9, 7, 11, 7 };
        final int val = 7;
        final int[] expectedNums = new int[] { 1, 2, 3, 5, 6, 9, 11 };
        WHEN: {}
        final int k = impl.removeElement(nums, val);
        THEN: {}
        Assertions.assertEquals(expectedNums.length, k);
        Arrays.sort(nums, 0, k);
        for (var i = 0; i < k; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }
    @Test
    public void testElementIsSingleValue() {
        GIVEN: {}
        final int[] nums = new int[] { 7, 7, 7, 7, 7, 7, 7, };
        final int val = 7;
        WHEN: {}
        final int k = impl.removeElement(nums, val);
        THEN: {}
        Assertions.assertEquals(0, k);
    }
}
