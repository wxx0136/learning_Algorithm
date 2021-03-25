package com.easy.Strings;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/879/

/*
1.字符数组整除2，首尾字符以此交换赋值
 */

public class ReverseString {
    public void reverseString(char[] s) {
        for (int i = 0, sLength = s.length; i < sLength / 2; i++) {
            char temp = s[i];
            s[i] = s[sLength - 1 - i];
            s[sLength - 1 - i] = temp;
        }
    }
}
