package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/number-of-laser-beams-in-a-bank
 * Title: 2125. Number of Laser Beams in a Bank
 * Difficulty: Medium
 */
public class Problem2125 {
    public int numberOfBeams(String[] bank) {
        int[] numberOfLasers = new int[bank.length];
        for (int i = 0; i < bank.length; i++) {
            for (char c : bank[i].toCharArray()) {
                if (c == '1') numberOfLasers[i]++;
            }
        }
        int numberOfBeams = 0;
        for (int i = 0; i < numberOfLasers.length; i++) {
            if (numberOfLasers[i] != 0 && i + 1 < numberOfLasers.length) {
                int distance = 1;
                if (numberOfLasers[i + 1] == 0) {
                    for (int j = i + 1; j < numberOfLasers.length && numberOfLasers[j] == 0; j++) {
                        distance++;
                    }
                }
                if (i + distance < numberOfLasers.length) {
                    numberOfBeams += (numberOfLasers[i] * numberOfLasers[i + distance]);
                }
            }
        }
        return numberOfBeams;
    }
}
