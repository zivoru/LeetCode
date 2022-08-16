package java.ru.zivo.leetcode.problems;

/**
 * Source : https://leetcode.com/problems/palindrome-number
 * Author : Zimin Vladimir
 * Date   : 2022-07-23
 */

public class Problem9 {
    public boolean isPalindrome(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        return stringBuilder.toString().equals(stringBuilder.reverse().toString());
    }
}
