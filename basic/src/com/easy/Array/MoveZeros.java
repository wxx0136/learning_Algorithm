package com.easy.Array;

import java.util.Arrays;

public class MoveZeros {
    public void moveZeroes(int[] nums) {
        int l = nums.length;
        if (l == 0) return;
        int j = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int x = j; x < l; x++) {
            nums[x] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
