package ru.zivo.problems;

/**
 * Source: https://leetcode.com/problems/defanging-an-ip-address
 * Title: 1108. Defanging an IP Address
 * Difficulty: Easy
 */
public class Problem1108 {
    public String defangIPaddr(String address) {
        StringBuilder res = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c == '.') {
                res.append('[').append(c).append(']');
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }
}
