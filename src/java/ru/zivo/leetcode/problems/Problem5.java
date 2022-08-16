package java.ru.zivo.leetcode.problems;

/**
 * Source : https://leetcode.com/problems/longest-palindromic-substring
 * Author : Zimin Vladimir
 * Date   : 2022-08-15
 */
public class Problem5 {
    public static String longestPalindrome(String s) {
        String result = "";

        for (int d = 0; d < s.length(); d++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = d; i < s.length(); i++) {
                stringBuilder.append(s.charAt(i));
                if (stringBuilder.toString().equals(new StringBuffer(stringBuilder).reverse().toString())) {
                    if (stringBuilder.length() > result.length()) {
                        result = stringBuilder.toString();
                    }
                }
            }
        }

        return result.length() == 0 ? null : result;
    }
}
