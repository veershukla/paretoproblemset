package com.veer.arraysandhashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board =
                {{'1', '2', '.', '.', '3', '.', '.', '.', '.'},
                        {'4', '.', '.', '5', '.', '.', '.', '.', '.'},
                        {'.', '9', '8', '.', '.', '.', '.', '.', '3'},
                        {'5', '.', '.', '.', '6', '.', '.', '.', '4'},
                        {'.', '.', '.', '8', '.', '3', '.', '.', '5'},
                        {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        {'.', '.', '.', '.', '.', '.', '2', '.', '.'},
                        {'.', '.', '.', '4', '1', '9', '.', '.', '8'},
                        {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {

        Set[] rowSet = new HashSet[9];
        Set[] columnSet = new HashSet[9];
        Set[] boxSet = new HashSet[9];
        ///preparing all hashset required for validate sudoku
        for (int i = 0; i < 9; i++) {
            rowSet[i] = new HashSet<Character>();
            columnSet[i] = new HashSet<Character>();
            boxSet[i] = new HashSet<Character>();
        }

        //now iterate each cell
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                //cell value
                Character c = board[i][j];
                if (c.equals('.')) {
                    continue;
                }
                if (rowSet[i].contains(c)) {
                    return false;
                }
                rowSet[i].add(c);

                if (columnSet[j].contains(c)) {
                    return false;
                }
                columnSet[j].add(c);

                int boxIndex = (i / 3) * 3 + (j / 3);
                if (boxSet[boxIndex].contains(c)) {
                    return false;
                }
                boxSet[boxIndex].add(c);
            }
        }
        return true;
    }
}
