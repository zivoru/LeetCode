package ru.zivo.problems;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/**
 * Source : https://leetcode.com/problems/remove-duplicates-from-sorted-array
 * Author : Zimin Vladimir
 * Date   : 2022-08-16
 */

public class Problem26 {
    public int removeDuplicates(int[] nums) {
        Set<Integer> result = new LinkedHashSet<>();
        for (int num : nums) {
            result.add(num);
        }

        int i = 0;
        for (Integer integer : result) {
            nums[i] = integer;
            i++;
        }

        for (int j = result.size(); j < nums.length; j++) {
            nums[j] = 0;
        }
        return result.size();
    }
}
