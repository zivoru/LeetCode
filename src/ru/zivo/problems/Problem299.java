package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/bulls-and-cows
 * Title: 299. Bulls and Cows
 * Difficulty: Medium
 */
public class Problem299 {
    public String getHint(String secret, String guess) {
        int bulls = 0, cows = 0, i = 0, j = 0;
        int[] chars = new int[58], indexes = new int[secret.length()];

        for (char c : secret.toCharArray()) {
            if (guess.charAt(i) == c) {
                bulls++;
                indexes[i]++;
            } else {
                chars[c]++;
            }
            i++;
        }

        for (char c : guess.toCharArray()) {
            if (chars[c] > 0 && indexes[j] == 0) {
                cows++;
                chars[c]--;
            }
            j++;
        }

        return "%dA%dB".formatted(bulls, cows);
    }
}
