package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/spiral-matrix
 * Title: 54. Spiral Matrix
 * Difficulty: Medium
 */
public class Problem54 {
    enum Direction { T, R, D, L }

    int top = 0, right, down, left = 0;

    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        right = matrix[0].length;
        down = matrix.length;
        recursion(matrix, Direction.R, res, right * down);
        return res;
    }

    private void recursion(int[][] matrix, Direction r, List<Integer> res, int size) {
        if (res.size() == size) return;
        switch (r) {
            case R -> {
                for (int i = left; i < right; i++) {
                    res.add(matrix[top][i]);
                }
                top++;
                recursion(matrix, Direction.D, res, size);
            }
            case D -> {
                for (int i = top; i < down; i++) {
                    res.add(matrix[i][right - 1]);
                }
                right--;
                recursion(matrix, Direction.L, res, size);
            }
            case L -> {
                for (int i = right - 1; i >= left; i--) {
                    res.add(matrix[down - 1][i]);
                }
                down--;
                recursion(matrix, Direction.T, res, size);
            }
            case T -> {
                for (int i = down - 1; i >= top; i--) {
                    res.add(matrix[i][left]);
                }
                left++;
                recursion(matrix, Direction.R, res, size);
            }
        }
    }
}
