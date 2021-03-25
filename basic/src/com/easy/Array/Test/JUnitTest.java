package com.easy.Array.Test;

import com.easy.Array.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JUnitTest {

    @Test
    public void removeDuplicates_test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void maxProfit_test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{3, 2, 5, 8, 1, 9}));
    }

    @Test
    public void rotateArray_test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    @Test
    public void containsDuplicate_N_test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/578/
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate_N(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void singleNumber_test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/549/
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    public void intersectionOfTwoArrays2_test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/
        IntersectionOfTwoArrays2 intersectionOfTwoArrays2 = new IntersectionOfTwoArrays2();
        int[] nums1 = {4, 9, 5};
        int[] nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersectionOfTwoArrays2.intersect(nums1, nums2)));
//        System.out.println(Arrays.toString(intersectionOfTwoArrays2.intersect_sorted(nums1, nums2)));
    }

    @Test
    public void plusOne_test() {
        PlusOne plusOne = new PlusOne();
        int[] nums = new int[]{9, 9, 9};
        System.out.println(Arrays.toString(plusOne.plusOne(nums)));
    }

    @Test
    public void moveZeros_test() {
        MoveZeros moveZeros = new MoveZeros();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeros.moveZeroes(nums);
    }
}
