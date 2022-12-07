package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number
 * Title: 1365. How Many Numbers Are Smaller Than the Current Number
 * Difficulty: Easy
 */
public class Problem1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    ans[i]++;
                } else if (nums[j] != nums[i]){
                    ans[j]++;
                }
            }
        }

        return ans;
    }
}
