package ru.zivo.problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/generate-parentheses
 * Title: 22. Generate Parentheses
 * Difficulty: Medium
 */
public class Problem22 {
    List<String> parenthesis = new ArrayList<>();
    StringBuilder sb = new StringBuilder();

    public List<String> generateParenthesis(int n) {
        generate(n, n);
        return parenthesis;
    }

    public void generate(int left, int right) {
        if (left != 0 && right != 0) {
            sb.append('(');
            generate(left - 1, right);
            sb.setLength(sb.length() - 1);
            sb.append(')');
            generate(left, right - 1);
        } else if (left != 0) {
            sb.append('(');
            generate(left - 1, right);
        } else if (right != 0) {
            sb.append(')');
            generate(left, right - 1);
        } else {
            if (isValid(sb.toString())) parenthesis.add(sb.toString());
            return;
        }
        sb.setLength(sb.length() - 1);
    }

    public boolean isValid(String s) {
        List<Character> stack = new LinkedList<>();
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
                if (c == ')') stack.remove(index--);
                if (c == ']' || c == '}') return false;
            } else if (character == '[') {
                if (c == ']') stack.remove(index--);
                if (c == ')' || c == '}') return false;
            } else if (character == '{') {
                if (c == '}') stack.remove(index--);
                if (c == ']' || c == ')') return false;
            } else return false;
        }
        return stack.isEmpty();
    }
}
