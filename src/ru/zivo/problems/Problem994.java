package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/rotting-oranges
 * Title: 994. Rotting Oranges
 * Difficulty: Medium
 */
public class Problem994 {
    int number = 0;

    public int orangesRotting(int[][] grid) {
        Set<Integer> used = new HashSet<>();
        while (!check(grid)) {
            rot(grid, used);
            number++;
        }
        return number;
    }

    private void rot(int[][] grid, Set<Integer> used) {
        Set<Integer> justRotted = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int mxn = i * 10 + j;
                if (grid[i][j] == 2 && !justRotted.contains(mxn) && !used.contains(mxn)) {
                    used.add(mxn);
                    if (j != 0 && grid[i][j - 1] == 1) {
                        grid[i][j - 1] = 2;
                    }
                    if (j != grid[i].length - 1 && grid[i][j + 1] == 1) {
                        grid[i][j + 1] = 2;
                        justRotted.add(i * 10 + j + 1);
                    }
                    if (i != 0 && grid[i - 1][j] == 1) {
                        grid[i - 1][j] = 2;
                    }
                    if (i != grid.length - 1 && grid[i + 1][j] == 1) {
                        grid[i + 1][j] = 2;
                        justRotted.add((i + 1) * 10 + j);
                    }
                }
            }
        }
    }

    private boolean check(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    if (j != 0 && grid[i][j - 1] == 2) {
                        return false;
                    }
                    if (j != grid[i].length - 1 && grid[i][j + 1] == 2) {
                        return false;
                    }
                    if (i != 0 && grid[i - 1][j] == 2) {
                        return false;
                    }
                    if (i != grid.length - 1 && grid[i + 1][j] == 2) {
                        return false;
                    }
                    if (!searchRotten(i, j, grid, new HashSet<>())) {
                        return false;
                    }
                    number = -1;
                    return true;
                }
            }
        }
        return true;
    }

    private boolean searchRotten(int i, int j, int[][] grid, Set<Integer> used) {
        used.add(i * 10 + j);
        boolean rot = true;
        if (j != 0 && !used.contains(i * 10 + j - 1)) {
            if (grid[i][j - 1] == 2) return false;
            if (grid[i][j - 1] == 1) rot = searchRotten(i, j - 1, grid, used);
        }
        if (rot && j != grid[i].length - 1 && !used.contains(i * 10 + j + 1)) {
            if (grid[i][j + 1] == 2) return false;
            if (grid[i][j + 1] == 1) rot = searchRotten(i, j + 1, grid, used);
        }
        if (rot && i != 0 && !used.contains((i - 1) * 10 + j)) {
            if (grid[i - 1][j] == 2) return false;
            if (grid[i - 1][j] == 1) rot = searchRotten(i - 1, j, grid, used);
        }
        if (rot && i != grid.length - 1 && !used.contains((i + 1) * 10 + j)) {
            if (grid[i + 1][j] == 2) return false;
            if (grid[i + 1][j] == 1) rot = searchRotten(i + 1, j, grid, used);
        }
        return rot;
    }
}
