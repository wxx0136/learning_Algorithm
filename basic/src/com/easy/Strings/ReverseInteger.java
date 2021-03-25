package com.easy.Strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/880/

/*
1.将X取模或为个位数tail
2.将个位数存入新结果newResult
3.判断此时newResult是否溢出[-2^31,2^31-1]
4.溢出了就返回0，不溢出将临时结果存入result
5.X削一位，循环判断并取模拿到最后的一位
6.将之前的result*10升一位，并和新获得的tail累加，获得新值newResult
7.循环往复
 */

public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }

        return result;
    }
}

