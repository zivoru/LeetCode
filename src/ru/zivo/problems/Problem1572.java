package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/matrix-diagonal-sum
 * Title: 1572. Matrix Diagonal Sum
 * Difficulty: Easy
 */
class Problem1572 {
    public int diagonalSum(int[][] mat) {
        int indent = 0, length = mat[0].length - 1, sum = 0;
        boolean dir = true;
        for (int[] arr : mat) {
            int l = indent, r = length - indent;
            if (l == r) {
                sum += arr[l];
                indent--;
                dir = false;
            } else {
                sum += arr[l] + arr[r];
                if (l < r) {
                    if (dir) {
                        indent++;
                    } else {
                        indent--;
                    }
                } else {
                    indent -= 2;
                    dir = false;
                }
            }
        }
        return sum;
    }
}
