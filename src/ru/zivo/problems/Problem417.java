package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/pacific-atlantic-water-flow
 * Title: 417. Pacific Atlantic Water Flow
 * Difficulty: Medium
 */
public class Problem417 {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        boolean[][] pacific = new boolean[m][n], atlantic = new boolean[m][n];

        for (int i = 0; i < n; i++) {
            travel(heights, 0, i, pacific, Integer.MIN_VALUE);
            travel(heights, m - 1, i, atlantic, Integer.MIN_VALUE);
        }
        for (int i = 0; i < m; i++) {
            travel(heights, i, 0, pacific, Integer.MIN_VALUE);
            travel(heights, i, n - 1, atlantic, Integer.MIN_VALUE);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacific[i][j] && atlantic[i][j]) {
                    res.add(List.of(i, j));
                }
            }
        }
        return res;
    }

    public void travel(int[][] heights, int i, int j, boolean[][] ocean, int height) {
        if (i < 0 || i > heights.length - 1) return;
        if (j < 0 || j > heights[0].length - 1) return;
        if (ocean[i][j]) return;
        if (heights[i][j] < height) return;

        ocean[i][j] = true;

        travel(heights, i + 1, j, ocean, heights[i][j]);
        travel(heights, i - 1, j, ocean, heights[i][j]);
        travel(heights, i, j + 1, ocean, heights[i][j]);
        travel(heights, i, j - 1, ocean, heights[i][j]);
    }
}
