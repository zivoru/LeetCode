package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * Author : Zimin Vladimir
 * Date   : 2022-08-16
 */

public class Problem26 {
    public int removeDuplicates(int[] nums) {
        int c = 0;
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length) {
                if (nums[i] == nums[i + 1]) {
                    c++;
                } else {
                    nums[i - c] = nums[i];
                    result++;
                }
            } else {
                nums[i - c] = nums[i];
                result++;
            }
        }
        return result;
    }
}
