package ru.zivo.problems;

import java.util.HashMap;
import java.util.Map;

/**
 * Source : https://leetcode.com/problems/valid-sudoku
 * Author : Zimin Vladimir
 * Date   : 2022-08-17
 */
public class Problem36 {
    public boolean isValidSudoku(char[][] board) {
        Map<Character, Byte> square1 = new HashMap<>();
        Map<Character, Byte> square2 = new HashMap<>();
        Map<Character, Byte> square3 = new HashMap<>();

        for (int i = 0; i < board.length; i++) {
            if (i == 3 || i == 6) {
                square1.clear();
                square2.clear();
                square3.clear();
            }

            Map<Character, Byte> map = new HashMap<>();

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (map.containsKey(board[i][j])) {
                        return false;
                    } else {
                        map.put(board[i][j], (byte) 1);
                    }

                    if (j == 0 || j == 1 || j == 2) {
                        if (square1.containsKey(board[i][j])) {
                            return false;
                        } else {
                            square1.put(board[i][j], (byte) 1);
                        }
                    }

                    if (j == 3 || j == 4 || j == 5) {
                        if (square2.containsKey(board[i][j])) {
                            return false;
                        } else {
                            square2.put(board[i][j], (byte) 1);
                        }
                    }

                    if (j == 6 || j == 7 || j == 8) {
                        if (square3.containsKey(board[i][j])) {
                            return false;
                        } else {
                            square3.put(board[i][j], (byte) 1);
                        }
                    }

                    for (int k = i + 1; k < board.length; k++) {
                        if (board[k][j] == board[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
