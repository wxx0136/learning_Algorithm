package com.company.easy.Array.Test;

import com.company.easy.Array.MaxProfit;
import com.company.easy.Array.RemoveDuplicates;
import com.company.easy.Array.RotateArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitTest {

    @Test
    public void RemoveDuplicates_Test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        System.out.println(removeDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
    }

    @Test
    public void MaxProfit_Test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/564/
        MaxProfit maxProfit = new MaxProfit();
        System.out.println(maxProfit.maxProfit(new int[]{3, 2, 5, 8, 1, 9}));
    }

    @Test
    public void RotateArray_Test() {
        //https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/646/
        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

}
