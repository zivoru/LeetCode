package java.ru.zivo.leetcode.problems;

/**
 * Source : https://leetcode.com/problems/reverse-integer
 * Author : Zimin Vladimir
 * Date   : 2022-07-23
 */

public class Problem7 {
    public int reverse(int x) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(x));
        Long result;
        if (String.valueOf(stringBuilder.charAt(0)).equals("-")) {
            stringBuilder.deleteCharAt(0);
            result = Long.valueOf("-" + stringBuilder.reverse());
        } else {
            result = Long.valueOf(String.valueOf(stringBuilder.reverse()));
        }
        return result > 2147483647 || result < -2147483647 ? 0 : Integer.parseInt(String.valueOf(result));
    }
}
