package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/largest-local-values-in-a-matrix
 * Title: 2373. Largest Local Values in a Matrix
 * Difficulty: Easy
 */
public class Problem2373 {
    public int[][] largestLocal(int[][] grid) {
        int size = grid.length - 2;
        int[][] res = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                int max = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (grid[row + i][column + j] > max) {
                            max = grid[row + i][column + j];
                        }
                    }
                }

                res[row][column] = max;
            }
        }
        return res;
    }
}
