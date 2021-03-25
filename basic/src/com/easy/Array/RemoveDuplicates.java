package com.easy.Array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/

/*
测试用例：new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}
++i是先自增，再返回值
1.因为数组是排过序的，设j为锚定点，
2.i为光标，从0开始向右走
3.i发现新值，就放在j的右边，然后j向右移动一位
4.i继续向右重复直到数组结束
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                nums[++j] = nums[i];
            }
        }
        return ++j;
    }
}
