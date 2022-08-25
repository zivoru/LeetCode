package ru.zivo.problems;

import java.util.HashSet;
import java.util.Set;

/**
 * Source: https://leetcode.com/problems/valid-sudoku
 * Title: 36. Valid Sudoku
 * Difficulty: Medium
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

                    Set<Character> dummySquare;
                    if (j <= 2) {
                        dummySquare = square1;
                    } else if (j <= 5) {
                        dummySquare = square2;
                    } else {
                        dummySquare = square3;
                    }

                    if (dummySquare.contains(board[i][j])) {
                        return false;
                    } else {
                        dummySquare.add(board[i][j]);
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
