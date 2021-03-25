package com.easy.Array.Test;

import com.easy.Array.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class JUnitTest {

    @Test
    public void removeDuplicates_test() {
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void maxProfit_test() {
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{3, 2, 5, 8, 1, 9}));
    }

    @Test
    public void rotateArray_test() {
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    @Test
    public void containsDuplicate_N_test() {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate_N(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void singleNumber_test() {
        SingleNumber singleNumber = new SingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    public void intersectionOfTwoArrays2_test() {
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

    @Test
    public void twoSum_test() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
        System.out.println(nums[result[0]] + " + " + nums[result[1]] + " = " + target);
    }

    @Test
    public void validSudoku_test() {
        ValidSudoku validSudoku = new ValidSudoku();
        char[][] board = new char[][]{
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        System.out.println(board[0].length);
        System.out.println(board.length);
        System.out.println(validSudoku.isValidSudoku(board));
    }

    @Test
    public void rotateImage_test() {
        RotateImage rotateImage = new RotateImage();
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        System.out.println(Arrays.deepToString(matrix));
        rotateImage.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }

}
