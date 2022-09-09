package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/flood-fill
 * Title: 733. Flood Fill
 * Difficulty: Easy
 */
public class Problem733 {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oldColor = image[sr][sc];
        if (oldColor != color) {
            image[sr][sc] = color;
            fill(image, sr, sc, color, oldColor);
        }
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int color, int oldColor) {
        if (sr - 1 >= 0) {
            if (image[sr - 1][sc] == oldColor) {
                image[sr - 1][sc] = color;
                fill(image, sr - 1, sc, color, oldColor);
            }
        }
        if (image.length > sr + 1) {
            if (image[sr + 1][sc] == oldColor) {
                image[sr + 1][sc] = color;
                fill(image, sr + 1, sc, color, oldColor);
            }
        }
        if (sc - 1 >= 0) {
            if (image[sr][sc - 1] == oldColor) {
                image[sr][sc - 1] = color;
                fill(image, sr, sc - 1, color, oldColor);
            }
        }
        if (image[sr].length > sc + 1) {
            if (image[sr][sc + 1] == oldColor) {
                image[sr][sc + 1] = color;
                fill(image, sr, sc + 1, color, oldColor);
            }
        }
    }
}
