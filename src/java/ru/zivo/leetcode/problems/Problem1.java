package java.ru.zivo.leetcode.problems;

/**
 * Source : https://leetcode.com/problems/two-sum
 * Author : Zimin Vladimir
 * Date   : 2022-07-21
 */

public class Problem1 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int i1 = i + 1; i1 < nums.length; i1++) {
                if (nums[i] + nums[i1] == target) {
                    return new int[]{i, i1};
                }
            }
        }
        return null;
    }
}
