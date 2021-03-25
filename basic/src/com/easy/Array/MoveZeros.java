package com.easy.Array;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/567/

/*
1.用双指针，in-place方式数组中直接替换值
2.以i为索引以此循环，j为指针，确定最终输出结果
3.如果i的元素不为0，就将其保存在j位置，然后j++向后移动
4.i循环结束，j之前的数组即为想要的结果，从j开始以后都设置为0即可
 */
public class MoveZeros {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }

        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }
}
