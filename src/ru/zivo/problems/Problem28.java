package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/implement-strstr
 * Author : Zimin Vladimir
 * Date   : 2022-08-16
 */
public class Problem28 {
    public int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length()) return -1;
        int result = -1;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                result = i;
                boolean g = true;
                for (int j = 1; j < needle.length(); j++) {
                    if (haystack.length() == i + j) {
                        result = -1;
                        g = false;
                        break;
                    }
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        result = -1;
                        g = false;
                        break;
                    }
                }
                if (g) break;
            }
        }
        return result;
    }
}
