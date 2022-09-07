package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/first-bad-version
 * Title: 278. First Bad Version
 * Difficulty: Easy
 */
public class Problem278 {
    boolean isBadVersion(int version) {
        return false;
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
