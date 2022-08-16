package java.ru.zivo.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source : https://leetcode.com/problems/median-of-two-sorted-arrays
 * Author : Zimin Vladimir
 * Date   : 2022-08-15
 */

public class Problem4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> nums = new ArrayList<>();

        for (int i : nums1) {
            nums.add(i);
        }
        for (int i : nums2) {
            nums.add(i);
        }

        List<Integer> sortedNums = nums.stream().sorted().toList();
        if (sortedNums.size() % 2 != 0) {
            return sortedNums.get((int) (sortedNums.size() * 0.5));
        }
        return ((double) sortedNums.get((int) (sortedNums.size() * 0.5))
                + sortedNums.get((int) (sortedNums.size() * 0.5 - 1))) / 2;
    }
}
