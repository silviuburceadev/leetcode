package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.model.TreeNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SameTreeTest {

    public static final SameTree IMPL = new SameTree();

    @Test
    void testSameTree() {
        GIVEN: {}
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        WHEN: {}
        boolean result = IMPL.isSameTree(p, q);
        THEN: {}
        assertThat(result).isTrue();
    }

    @Test
    void testNoLeftTree() {
        GIVEN: {}
        TreeNode p = new TreeNode(1, null, new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        WHEN: {}
        boolean result = IMPL.isSameTree(p, q);
        THEN: {}
        assertThat(result).isFalse();
    }

    @Test
    void testNoRightTree() {
        GIVEN: {}
        TreeNode p = new TreeNode(1, new TreeNode(2), null);
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        WHEN: {}
        boolean result = IMPL.isSameTree(p, q);
        THEN: {}
        assertThat(result).isFalse();
    }

    @Test
    void testSameTreeStructureDifferentValue() {
        GIVEN: {}
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2), new TreeNode(4));
        WHEN: {}
        boolean result = IMPL.isSameTree(p, q);
        THEN: {}
        assertThat(result).isFalse();
    }

}