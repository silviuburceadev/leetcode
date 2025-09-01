package com.github.silviuburceadev.leetcode.core.model.tree;

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

}
