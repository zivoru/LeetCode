package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/count-and-say
 * Title: 38. Count and Say
 * Difficulty: Medium
 */
public class Problem38 {
    int i = 1;
    String result;

    public String countAndSay(int n) {
        if (n == 1) return "1";
        recursion("1", n);
        return result;
    }

    private void recursion(String start, int n) {
        StringBuilder countAndSay = new StringBuilder();

        int count = 0;
        char character = 0;
        for (char c : start.toCharArray()) {
            if (c != character) {
                if (count != 0) {
                    countAndSay.append(count).append(character);
                }
                character = c;
                count = 1;
            } else {
                count++;
            }
        }
        countAndSay.append(count).append(character);

        i++;

        if (i == n) {
            result = String.valueOf(countAndSay);
            i = 1;
        } else {
            recursion(countAndSay.toString(), n);
        }
    }
}
