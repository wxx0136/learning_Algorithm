package com.easy.Array;

import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/769/

/*
1.Set里的元素是不可重复的
2.在一个9*9的数独里，假设char[0][7] = 4
2.我们通过3种标记方法，来将一个元素放入Set：
行标记法：(4)0
列标记法：7(4)
3*3的子块标记法为: 0/3=0,7/3=2,0(4)2
4使用 Set.add()方法把数独中的每个元素都通过三种标记法加入Set，如果加入失败就说明重复了，返回false
 */

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        int row = board.length;
        int column = board[0].length;

        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < column; ++j) {
                if (board[i][j] != '.') {
                    String b = "(" + board[i][j] + ")";
                    if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i / row + b + j / column))
                        return false;
                }
            }
        }
        return true;
    }
}
