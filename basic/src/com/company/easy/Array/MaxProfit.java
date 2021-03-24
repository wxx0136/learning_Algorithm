package com.company.easy.Array;

/*
测试用例：new int[]{3, 2, 5, 8, 1, 9})
1.找到买入点最小值
2.找到买入点后最大值
3.累计利润
4.找到新的最小值
5.找到新的最大值
6.累计利润
7.重复到买入点找不到新的最小值结束
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] <= prices[i]) {
                i++;
            }
            buy = prices[i];

            while (i < N && prices[i + 1] > prices[i]) i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit;
    }
}
