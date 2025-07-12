package com.github.silviuburceadev.leetcode.core.model.uf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UnionFindMap<T extends Comparable<T>> implements UnionFind<T> {

    private final Map<T, List<T>> elementGroups;

    public UnionFindMap() {
        this.elementGroups = new HashMap<>();
    }

    @Override
    public void union(T left, T right) {
        var leftGroup = elementGroups.computeIfAbsent(left, k1 -> new ArrayList<>(List.of(left)));
        var rightGroup = elementGroups.computeIfAbsent(right, k -> new ArrayList<>(List.of(right)));
        var leftParent = find(left);
        var rightParent = find(right);

        if (leftParent != rightParent) {
            // merge the groups
            leftGroup.addAll(rightGroup);
            rightGroup.forEach(el -> elementGroups.put(el, leftGroup));
        }
    }

    @Override
    public T find(T element) {
        return elementGroups.getOrDefault(element, new ArrayList<>())
            .stream()
            .sorted()
            .findFirst()
            .orElse(element);
    }
}
