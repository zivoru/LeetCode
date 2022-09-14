package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/backspace-string-compare
 * Title: 844. Backspace String Compare
 * Difficulty: Easy
 */
public class Problem844 {
    public boolean backspaceCompare(String s, String t) {
        List<Character> charsS = new ArrayList<>(), charsT = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c == '#') {
                if (!charsS.isEmpty())
                    charsS.remove(charsS.size() - 1);
            } else {
                charsS.add(c);
            }
        }

        for (char c : t.toCharArray()) {
            if (c == '#') {
                if (!charsT.isEmpty())
                    charsT.remove(charsT.size() - 1);
            } else {
                charsT.add(c);
            }
        }

        if (charsS.size() != charsT.size())
            return false;

        int i = 0;
        for (Character c : charsS) {
            if (c != charsT.get(i)) {
                return false;
            }
            i++;
        }

        return true;
    }
}
