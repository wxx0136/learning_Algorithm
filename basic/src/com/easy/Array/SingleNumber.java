package com.easy.Array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
