package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;
import com.github.silviuburceadev.leetcode.core.model.ListNode;

@Problem(61)
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        var last = head;
        var size = 1;

        while (last.next != null) {
            last = last.next;
            size++;
        }

        // form a cycle
        last.next = head;
        // rotate left instead
        k = size - k % size;
        while (k-- > 0) {
            last = last.next;
        }
        // find the new head
        head = last.next;
        // break the cycle
        last.next = null;

        return head;
    }
}
