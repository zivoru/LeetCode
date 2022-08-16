package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * Author : Zimin Vladimir
 * Date   : 2022-08-16
 */

public class Problem26 {
    public int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; ) {
            if (map.get(nums[i]) != null) {
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
                map.put(nums[i], i);
                i++;
            }
        }
        return map.size();
    }
}
