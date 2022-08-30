package ru.zivo.problems;

import java.util.ArrayList;
import java.util.List;

/**
 * Source: https://leetcode.com/problems/multiply-strings
 * Title: 43. Multiply Strings
 * Difficulty: Medium
 */
public class Problem43 {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        if (num1.equals("1")) return num2;
        if (num2.equals("1")) return num1;

        List<Integer> nums1 = new ArrayList<>();
        List<Integer> nums2 = new ArrayList<>();

        for (char c : num1.toCharArray()) {
            nums1.add(Character.getNumericValue(c));
        }
        for (char c : num2.toCharArray()) {
            nums2.add(Character.getNumericValue(c));
        }

        List<List<Integer>> multiplies = new ArrayList<>();
        List<Integer> multiply = new ArrayList<>();

        for (int i = nums1.size() - 1, nol = 0; i >= 0; i--, nol++) {
            boolean b = false;
            for (int j = 0; j < nol; j++) {
                multiply.add(0);
            }
            for (int j = nums2.size() - 1; j >= 0; j--) {
                int m = nums1.get(i) * nums2.get(j);
                if (b) {
                    if (m >= 10) {
                        int element = multiply.get(0) + m % 10;
                        if (element >= 10) {
                            multiply.set(0, element % 10);
                            multiply.add(0, element / 10 + (m / 10));
                        } else {
                            multiply.set(0, element);
                            multiply.add(0, m / 10);
                        }
                    } else {
                        multiply.set(0, multiply.get(0) + m);
                        b = false;
                    }
                } else {
                    if (m >= 10) {
                        multiply.add(0, m % 10);
                        multiply.add(0, m / 10);
                        b = true;
                    } else {
                        multiply.add(0, m);
                    }
                }
            }
            multiplies.add(new ArrayList<>(multiply));
            multiply.clear();
        }

        List<Integer> result = new ArrayList<>();

        int d = 0;
        for (int i = multiplies.get(multiplies.size() - 1).size() - 1, y = 1; i >= 0; i--, y++) {
            int m = multiplies.get(multiplies.size() - 1).get(i);
            for (int j = multiplies.size() - 2; j >= 0; j--) {
                if (multiplies.get(j).size() < y) break;
                m += multiplies.get(j).get(multiplies.get(j).size() - y);
            }
            if (m >= 10) {
                int element = (m % 10) + d;
                if (element >= 10) {
                    result.add(0, element % 10);
                    d = m / 10 + element / 10;
                } else {
                    result.add(0, element);
                    d = m / 10;
                }
            } else {
                int element = m + d;
                if (element >= 10) {
                    result.add(0, element % 10);
                    d = element / 10;
                } else {
                    result.add(0, element);
                    d = 0;
                }
            }
        }

        if (d != 0) result.add(0, d);

        StringBuilder sb = new StringBuilder();

        boolean q = true;
        for (Integer integer : result) {
            if (q && integer != 0) {
                q = false;
            }

            if (!q) {
                sb.append(integer);
            }
        }

        return sb.toString();
    }
}
