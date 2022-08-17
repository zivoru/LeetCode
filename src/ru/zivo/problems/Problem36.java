package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source : https://leetcode.com/problems/valid-sudoku
 * Author : Zimin Vladimir
 * Date   : 2022-08-17
 */
public class Problem36 {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> square1 = new HashSet<>();
        Set<Character> square2 = new HashSet<>();
        Set<Character> square3 = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            if (i == 3 || i == 6) {
                square1.clear();
                square2.clear();
                square3.clear();
            }

            Set<Character> line = new HashSet<>();

            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] != '.') {
                    if (line.contains(board[i][j])) {
                        return false;
                    } else {
                        line.add(board[i][j]);
                    }

                    if (j <= 2) {
                        if (square1.contains(board[i][j])) {
                            return false;
                        } else {
                            square1.add(board[i][j]);
                        }
                    }

                    if (j >= 3 && j <= 5) {
                        if (square2.contains(board[i][j])) {
                            return false;
                        } else {
                            square2.add(board[i][j]);
                        }
                    }

                    if (j >= 6) {
                        if (square3.contains(board[i][j])) {
                            return false;
                        } else {
                            square3.add(board[i][j]);
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
