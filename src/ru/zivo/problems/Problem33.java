package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/search-in-rotated-sorted-array
 * Author : Zimin Vladimir
 * Date   : 2022-08-18
 */
public class Problem33 {
    public int search(int[] nums, int target) {
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            if (nums[i] == target) {
                return i;
            }
        }
        for (int i = nums.length / 2; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
