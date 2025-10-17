package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.model.ListNode;

public class AddNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var carryOver = 0;

        var root = new ListNode();
        var current = root;
        while(l1 != null || l2 != null) {
            var left = 0;
            var right = 0;
            if (l1 != null) {
                left = l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                right = l2.val;
                l2 = l2.next;
            }
            var sum = left + right + carryOver;
            var next = new ListNode(sum % 10);
            carryOver = sum / 10;
            current.next = next;
            current = next;
        }

        if (carryOver != 0) {
            var next = new ListNode(carryOver);
            current.next = next;
        }

        return root.next;
    }
}
