package ru.zivo.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/find-all-anagrams-in-a-string
 * Title: 438. Find All Anagrams in a String
 * Difficulty: Medium
 */
public class Problem438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int lengthS = s.length(), lengthP = p.length(), i = 0;
        if (lengthS < lengthP) return res;
        int[] ss = new int[123], pp = new int[123];
        for (char c : p.toCharArray()) {
            ss[s.charAt(i++)]++;
            pp[c]++;
        }
        for (int j = lengthP; j < lengthS; j++) {
            if (Arrays.equals(ss, pp)) res.add(j - lengthP);
            ss[s.charAt(j - lengthP)]--;
            ss[s.charAt(j)]++;
        }
        if (Arrays.equals(ss, pp)) res.add(lengthS - lengthP);
        return res;
    }
}
