package ru.zivo.problems;

/**
 * Source : https://leetcode.com/problems/length-of-last-word
 * Author : Zimin Vladimir
 * Date   : 2022-08-23
 */
public class Problem58 {
    public int lengthOfLastWord(String s) {
        int length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                for (int j = i; j >= 0; j--) {
                    if (s.charAt(j) == ' ') {
                        break;
                    }
                    length++;
                }
                return length;
            }
        }
        return 0;
    }
}
