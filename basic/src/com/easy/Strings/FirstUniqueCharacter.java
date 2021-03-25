package com.easy.Strings;
//https://leetcode.com/explore/interview/card/top-interview-questions-easy/127/strings/881/

/*
1.新建一个容量为256的字符串，容纳ASCII
2.循环给的字符串s，取其每一个字符，将其转换为ASCII代码值
3.因为同一个字符对应的index是一样的，所以一旦有重复，该index位置的值会因自增而大于1
4.重新循环字符串s，如果该字符对应的ASCII索引位置在数组中的值为1，则直接return该索引，结束循环。
 */
public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1)
                return i;
        }
        return -1;
    }
}
