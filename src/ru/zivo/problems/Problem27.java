package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/remove-element
 * Author : Zimin Vladimir
 * Date   : 2022-08-16
 */

public class Problem27 {
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int result = 0;
        for (int i = 0; i < length; ) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length; j++) {
                    if (nums.length != j + 1) {
                        int num = nums[j + 1];
                        nums[j] = num;
                    } else {
                        nums[j] = 0;
                    }
                }
                length--;
            } else {
                result++;
                i++;
            }
        }
        return result;
    }
}
