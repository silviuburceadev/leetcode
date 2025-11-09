package com.github.silviuburceadev.leetcode.main;

import com.github.silviuburceadev.leetcode.core.meta.Revisit;

import java.util.HashMap;
import java.util.Map;

@Revisit({ "TLE", "Improve memoization?" })
public class MaximumPathScore {

    record Location(int row, int column) {
    }

    public int maxPathScore(int[][] grid, int k) {
        var cache = new HashMap<Location, Map<Integer, Integer>>();
        return walk(cache, grid, 0, 0, k);
    }

    private int walk(Map<Location, Map<Integer, Integer>> cache, int[][] grid, int i, int j, int k) {
        // out of bounds
        if (i == grid.length || j == grid[i].length) return -1;

        var budget = k - cost(grid, i, j);
        var location = new Location(i, j);
        Integer totalScore;
        if ((totalScore = cache.computeIfAbsent(location, (_) -> new HashMap<>()).get(budget)) != null) {
            return totalScore;
        }
        // too many costs
        if (budget < 0) {
            cache.get(location).put(budget, -1);
            return -1;
        }

        var score = grid[i][j];
        if (i == grid.length - 1 && j == grid[i].length - 1) return score;
        // go further
        var advance = Math.max(walk(cache, grid, i, j + 1, budget), walk(cache, grid, i + 1, j, budget));
        // -1 if no paths found
        totalScore = advance == -1 ? -1 : score + advance;
        cache.get(location).put(budget, totalScore);

        return totalScore;
    }

    private int cost(int[][] grid, int i, int j) {
        var cost = grid[i][j];
        return cost == 0 ? 0 : 1;
    }
}
