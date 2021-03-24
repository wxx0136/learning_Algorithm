package com.easy.Array;

/*
测试用例：new int[]{1, 2, 3, 4, 5, 6, 7}, 3
1.以K为分界点，将数组分为两个部分
2.整个数组反转
3.K前面的部分反转
4.K后面的部分反转
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
