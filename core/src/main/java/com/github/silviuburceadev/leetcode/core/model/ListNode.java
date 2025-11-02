package com.github.silviuburceadev.leetcode.core.model;

import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this(val, null);
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fromNumbers(int... numbers) {
        var listHolder = new ListNode();
        var reduced = Arrays.stream(numbers)
                .boxed()
                .map(ListNode::new)
                .reduce(listHolder, (last, node) -> {
                    last.next = node;
                    return node;
                });
        reduced = listHolder.next;

        return reduced;
    }

    public static ListNode fromDigits(int number) {
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
    public boolean equals(Object o) {
        if (!(o instanceof ListNode listNode)) return false;
        return val == listNode.val && Objects.equals(next, listNode.next);
    }

    @Override
    public String toString() {
        return "ListNode[val=%d, next=%s]".formatted(this.val, Optional.ofNullable(this.next).map(ListNode::toString).orElse(null));
    }
}
