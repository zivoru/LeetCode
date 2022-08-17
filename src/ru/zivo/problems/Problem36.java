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
        for (int i = 0; i < board.length; i++) {
            Map<Character, Byte> map = new HashMap<>();
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (map.containsKey(board[i][j])) {
                        return false;
                    } else {
                        map.put(board[i][j], (byte) 1);
                    }
                    for (int k = i + 1; k < board.length; k++) {
                        if (board[k][j] == board[i][j]) {
                            return false;
                        }
                    }
                }
            }
        }

        for (int k = 0; k < 7; k+=3) {
            Map<Character, Byte> square1 = new HashMap<>();
            Map<Character, Byte> square2 = new HashMap<>();
            Map<Character, Byte> square3 = new HashMap<>();

            for (int i = k; i < k + 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] != '.') {
                        if (square1.containsKey(board[i][j])) {
                            return false;
                        } else {
                            square1.put(board[i][j], (byte) 1);
                        }
                    }
                }

                for (int j = 3; j < 6; j++) {
                    if (board[i][j] != '.') {
                        if (square2.containsKey(board[i][j])) {
                            return false;
                        } else {
                            square2.put(board[i][j], (byte) 1);
                        }
                    }
                }

                for (int j = 6; j < 9; j++) {
                    if (board[i][j] != '.') {
                        if (square3.containsKey(board[i][j])) {
                            return false;
                        } else {
                            square3.put(board[i][j], (byte) 1);
                        }
                    }
                }
            }
        }

        return true;
    }
}
