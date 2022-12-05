package ru.zivo.problems;

import java.util.*;

/**
 * Source: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
 * Title: 1431. Kids With the Greatest Number of Candies
 * Difficulty: Easy
 */
public class Problem1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = 0;
        for (int candy : candies) {
            if (candy > max) {
                max = candy;
            }
        }
        List<Boolean> result = new ArrayList<>();
        for (int candy : candies) {
            result.add(candy + extraCandies >= max);
        }
        return result;
    }
}
