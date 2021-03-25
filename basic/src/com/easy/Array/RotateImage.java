package com.easy.Array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/770/

/*
1  2  3
4  5  6
7  8  9
先把矩阵的行都变成列 通过 matrix[i][j] = matrix[j][i]
1  4  7
2  5  8
3  6  9
再把每行的首尾以此对调，通过 matrix[i][j] = matrix[i][row - 1 - j];
7  4  1
8  5  2
9  6  3
 */
public class RotateImage {
    public void rotate(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = i; j < column; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = temp;
            }
        }
    }
}

