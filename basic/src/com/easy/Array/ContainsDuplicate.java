package com.easy.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/

/*
测试用例:[1,2,3,1]
1.新建一个Set<Integer>
2.遍历数组，发现一样的返回ture
3.否则添加进Set
4.全部遍历结束返回false
 */
public class ContainsDuplicate {
    public boolean containsDuplicate_N(int[] nums) {
        Set<Integer> distinct = new HashSet<>();
        for (int num : nums) {
            if (distinct.contains(num)) {
                return true;
            }
            distinct.add(num);
        }
        return false;
    }

    public boolean containsDuplicate_nlogN(int[] nums) {
        Arrays.sort(nums);
        for (int ind = 1; ind < nums.length; ind++) {
            if (nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }

    public boolean containsDuplicate_NN(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }


}
