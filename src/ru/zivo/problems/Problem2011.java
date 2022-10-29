package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/final-value-of-variable-after-performing-operations
 * Title: 2011. Final Value of Variable After Performing Operations
 * Difficulty: Easy
 */
public class Problem2011 {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String operation : operations) {
            if (operation.charAt(1) == '+') {
                x++;
            } else {
                x--;
            }
        }
        return x;
    }
}
