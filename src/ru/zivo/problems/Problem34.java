package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array
 * Author : Zimin Vladimir
 * Date   : 2022-08-18
 */
public class Problem34 {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                result[0] = i;
                break;
            }
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            if (target == nums[i]) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}
