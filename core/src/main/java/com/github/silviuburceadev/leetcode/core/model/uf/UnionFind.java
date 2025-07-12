package com.github.silviuburceadev.leetcode.core.model.uf;

public interface UnionFind<T extends Comparable<T>> {

    /**
     * Unites the given parameters in the same group. If they already belong to larger groups, the groups are merged.
     * @param left  the left param
     * @param right the right param
     */
    void union(T left, T right);

    /**
     * Finds the parent for the given element.
     * @param element   the element to be searched for
     * @return          the parent of the element, if exists, or the element itself
     */
    T find(T element);

    /**
     * Determines if the given parameters are connected.
     * @param left  the left param
     * @param right the right param
     * @return      true, if params are connected, i.e. belong to the same group, false otherwise
     */
    default boolean connected(T left, T right) {
        var leftParent = find(left);
        var rightParent = find(right);

        // use reference equality, expect the parents to be both the same reference
        return leftParent == rightParent;
    }
}
