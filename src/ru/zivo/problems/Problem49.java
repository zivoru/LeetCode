package ru.zivo.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Source : https://leetcode.com/problems/group-anagrams
 * Author : Zimin Vladimir
 * Date   : 2022-08-20
 */
public class Problem49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] alphabet = new int[123];
        alphabet['a'] = 3;alphabet['b'] = 5;alphabet['c'] = 7;
        alphabet['d'] = 11;alphabet['e'] = 13;alphabet['f'] = 17;
        alphabet['g'] = 19;alphabet['h'] = 23;alphabet['i'] = 29;
        alphabet['j'] = 31;alphabet['k'] = 37;alphabet['l'] = 41;
        alphabet['m'] = 43;alphabet['n'] = 47;alphabet['o'] = 53;
        alphabet['p'] = 59;alphabet['q'] = 61;alphabet['r'] = 67;
        alphabet['s'] = 71;alphabet['t'] = 73;alphabet['u'] = 79;
        alphabet['v'] = 83;alphabet['w'] = 89;alphabet['x'] = 97;
        alphabet['y'] = 101;alphabet['z'] = 103;
        Map<Integer, List<String>> groups = new HashMap<>();
        int product;
        List<String> strings;
        for (String str : strs) {
            product = 1;
            for (char aChar : str.toCharArray()) {
                product = product * alphabet[aChar];
            }
            strings = groups.get(product);
            if (strings != null) {
                strings.add(str);
            } else {
                groups.put(product, new ArrayList<>(List.of(str)));
            }
        }
        return new ArrayList<>(groups.values());
    }
}
