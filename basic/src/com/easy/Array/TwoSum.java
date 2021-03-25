package com.easy.Array;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/546/

/*
1.A+B=target，那么B=target-A
2.设置result数组记录A和B的index
3.新建HasMap<数组nums的值，数组索引>
4.依次循环，如果map中某个元素的key等于target-A，那么它就是B
5.否则就将该A元素加入map，等待后续查询
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}
