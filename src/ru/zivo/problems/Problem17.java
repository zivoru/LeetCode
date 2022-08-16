package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Source : https://leetcode.com/problems/letter-combinations-of-a-phone-number
 * Author : Zimin Vladimir
 * Date   : 2022-08-17
 */
public class Problem17 {
    public List<String> letterCombinations(String digits) {
        if (digits.equals("")) return new ArrayList<>();

        Map<Character, String[]> map = Map.of('2', new String[]{"a", "b", "c"},
                '3', new String[]{"d", "e", "f"}, '4', new String[]{"g", "h", "i"},
                '5', new String[]{"j", "k", "l"}, '6', new String[]{"m", "n", "o"},
                '7', new String[]{"p", "q", "r", "s"}, '8', new String[]{"t", "u", "v"},
                '9', new String[]{"w", "x", "y", "z"}
        );

        if (digits.length() == 1) {
            String[] strings = map.get(digits.charAt(0));
            return List.of(strings);
        }

        List<String> result = new ArrayList<>();
        for (int i = 0; i < map.get(digits.charAt(0)).length; i++) {
            for (int j = 0; j < map.get(digits.charAt(1)).length; j++) {
                String s = map.get(digits.charAt(0))[i];
                String s1 = map.get(digits.charAt(1))[j];
                if (digits.length() > 2) {
                    for (int k = 0; k < map.get(digits.charAt(2)).length; k++) {
                        String s2 = map.get(digits.charAt(2))[k];
                        if (digits.length() == 4) {
                            for (int l = 0; l < map.get(digits.charAt(3)).length; l++) {
                                result.add("%s%s%s%s".formatted(s, s1, s2, map.get(digits.charAt(3))[l]));
                            }
                        } else {
                            result.add("%s%s%s".formatted(s, s1, s2));
                        }
                    }
                } else {
                    result.add("%s%s".formatted(s, s1));
                }
            }
        }
        return result;
    }
}
