package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/unique-morse-code-words
 * Title: 804. Unique Morse Code Words
 * Difficulty: Easy
 */
public class Problem804 {
    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 1) return 1;

        String[] array = new String[123];
        array[97] = ".-";
        array[98] = "-...";
        array[99] = "-.-.";
        array[100] = "-..";
        array[101] = ".";
        array[102] = "..-.";
        array[103] = "--.";
        array[104] = "....";
        array[105] = "..";
        array[106] = ".---";
        array[107] = "-.-";
        array[108] = ".-..";
        array[109] = "--";
        array[110] = "-.";
        array[111] = "---";
        array[112] = ".--.";
        array[113] = "--.-";
        array[114] = ".-.";
        array[115] = "...";
        array[116] = "-";
        array[117] = "..-";
        array[118] = "...-";
        array[119] = ".--";
        array[120] = "-..-";
        array[121] = "-.--";
        array[122] = "--..";

        Set<String> strings = new HashSet<>();

        for (String word : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                stringBuilder.append(array[word.charAt(i)]);
            }
            strings.add(stringBuilder.toString());
        }

        return strings.size();
    }
}
