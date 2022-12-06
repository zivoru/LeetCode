package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
 * Title: 1281. Subtract the Product and Sum of Digits of an Integer
 * Difficulty: Easy
 */
public class Problem1281 {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;

        for (; n > 0; n /= 10) {
            product *= n % 10;
            sum += n % 10;
        }

        return product - sum;
    }
}
