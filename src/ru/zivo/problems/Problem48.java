package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/rotate-image
 * Title: 48. Rotate Image
 * Difficulty: Medium
 */
public class Problem48 {
    public void rotate(int[][] matrix) {
        int[][] clone = matrix.clone();
        int[] array;
        for (int i = 0, m = 0; i < matrix[0].length; i++, m++) {
            array = new int[matrix[0].length];
            for (int j = matrix.length - 1, k = 0; j >= 0; j--, k++) {
                array[k] = matrix[j][i];
            }
            clone[m] = array;
        }
        System.arraycopy(clone, 0, matrix, 0, clone.length);
    }
}
