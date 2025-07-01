package com.github.silviuburceadev.leetcode.core.model;

public final class TreeNode {
    public final int val;
    public final TreeNode left;
    public final TreeNode right;

    public TreeNode(int val) {
        this(val, null, null);
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode[" +
                "val=" + val + ", " +
                "left=" + left + ", " +
                "right=" + right + ']';
    }

}
