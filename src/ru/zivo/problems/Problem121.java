package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/best-time-to-buy-and-sell-stock
 * Title: 121. Best Time to Buy and Sell Stock
 * Difficulty: Easy
 */
public class Problem121 {
    public int maxProfit(int[] prices) {
        int min = prices[0], maxProfit = 0;
        for (int price : prices) {
            if (price < min) min = price;
            if (price - min > maxProfit) maxProfit = price - min;
        }
        return maxProfit;
    }
}
