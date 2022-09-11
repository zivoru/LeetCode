package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/unique-paths
 * Title: 62. Unique Paths
 * Difficulty: Medium
 */
public class Problem62 {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (i == m - 1 && j == n - 1) arr[i][j] = 1;
                else if (j == n - 1) {
                    arr[i][j] = arr[i + 1][j];
                } else if (i == m - 1) {
                    arr[i][j] = arr[i][j + 1];
                } else {
                    arr[i][j] = arr[i + 1][j] + arr[i][j + 1];
                }
            }
        }
        return arr[0][0];
    }
}
