package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/search-insert-position
 * Author : Zimin Vladimir
 * Date   : 2022-08-18
 */
public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}
