package java.ru.zivo.leetcode.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source : https://leetcode.com/problems/valid-parentheses
 * Author : Zimin Vladimir
 * Date   : 2022-07-27
 */

public class Problem20 {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();

        stack.add(s.charAt(0));
        int index = 0;
        for (int i = 1; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.add(c);
                index++;
            }

            char character = index >= 0 ? stack.get(index) : 'o';

            if (character == '(') {
                if (c == ')') {
                    stack.remove(index);
                    index--;
                } else if (c == ']' || c == '}') {
                    return false;
                }
            } else if (character == '[') {
                if (c == ']') {
                    stack.remove(index);
                    index--;
                } else if (c == ')' || c == '}') {
                    return false;
                }
            } else if (character == '{') {
                if (c == '}') {
                    stack.remove(index);
                    index--;
                } else if (c == ']' || c == ')') {
                    return false;
                }
            } else {
                return false;
            }

        }
        return stack.isEmpty();
    }
}
