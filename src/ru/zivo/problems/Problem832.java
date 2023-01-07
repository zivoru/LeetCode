package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/flipping-an-image
 * Title: 832. Flipping an Image
 * Difficulty: Easy
 */
public class Problem832 {
    public int[][] flipAndInvertImage(int[][] image) {
        for (int[] row : image) {
            for (int l = 0, r = row.length - 1; l <= r; l++, r--) {
                int rValue = row[r];
                row[r] = row[l] == 1 ? 0 : 1;
                row[l] = rValue == 1 ? 0 : 1;
            }
        }
        return image;
    }
}
