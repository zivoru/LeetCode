package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/search-a-2d-matrix
 * Title: 74. Search a 2D Matrix
 * Difficulty: Medium
 */
public class Problem74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = 0;
        for (; i < matrix.length - 1; i++) {
            if (target == matrix[i][0]) return true;
            if (target > matrix[i][0] && target < matrix[i + 1][0]) {
                return search(matrix, target, i);
            }
        }
        return search(matrix, target, i);
    }

    private boolean search(int[][] matrix, int target, int i) {
        int center = matrix[i].length / 2;
        int m = matrix[i][center];
        if (target == m) {
            return true;
        } else if (target < m) {
            for (int j = center; j >= 0; j--) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        } else {
            for (int j = center; j < matrix[i].length; j++) {
                if (target == matrix[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
