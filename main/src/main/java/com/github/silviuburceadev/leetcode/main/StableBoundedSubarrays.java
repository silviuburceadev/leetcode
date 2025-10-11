package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Problem;
import com.github.silviuburceadev.leetcode.core.meta.Revisit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Problem(3728)
@Revisit("TLE")
public class StableBoundedSubarrays {

    public long countStableSubarrays(int[] capacity) {
        var total = 0L;

        var valueIndexes = new HashMap<Integer, List<Integer>>();
        var prefix = new long[capacity.length];
        for (var i = 0; i < capacity.length; i++) {
            prefix[i] = (i == 0 ? 0 : prefix[i - 1]) + capacity[i];
            valueIndexes.computeIfAbsent(capacity[i], (_) -> new ArrayList<>()).add(i);
        }

        for (var valueIndex : valueIndexes.entrySet()) {
            var indexes = valueIndex.getValue();
            if (indexes.size() < 2) continue;
            for (var i = 0; i < indexes.size(); i++) {
                var leftIndex = indexes.get(i);
                for (var j = i + 1; j < indexes.size(); j++) {
                    var rightIndex = indexes.get(j);
                    if (rightIndex - leftIndex < 2) continue;
                    var sum = prefix[rightIndex - 1] - prefix[leftIndex];
                    if (valueIndex.getKey() == sum) total++;
                }
            }
        }

        return total;
    }

    static void main() {

    }
}
