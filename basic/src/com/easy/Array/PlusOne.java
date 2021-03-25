package com.easy.Array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/559/

public class PlusOne {
    /*
    1.倒序循环数组，从最后一个开始
    2.如果某一位为9，将其改成0
    3.如果不为9，将其加1，然后返回数组
    4.全部循环完了还没return，说明给的初始数组全是9
    5.现在改成了全是0，需要增加1位，并返回新数组(其实之前的数组不要了，只用了一个length而已）。
     */
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;

        return newNumber;
    }
}
