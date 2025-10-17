package com.github.silviuburceadev.leetcode.core.model;

import java.util.Optional;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this(val, null);
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fromNumber(int number) {
        var root = new ListNode(number % 10);
        var current = root;
        while ((number /= 10) != 0) {
            var next = new ListNode(number % 10);
            current.next = next;
            current = next;
        }

        return root;
    }

    @Override
    public String toString() {
        return "ListNode[val=%d, next=%s]".formatted(this.val, Optional.ofNullable(this.next).map(ListNode::toString).orElse(null));
    }
}
