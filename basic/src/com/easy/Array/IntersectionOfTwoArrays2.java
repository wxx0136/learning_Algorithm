package com.easy.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

//https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/674/

public class IntersectionOfTwoArrays2 {

    public int[] intersect(int[] nums1, int[] nums2) {
        /*
            1.新建一个HashMap，key是数组的值，value是标识符flag，用来判断是否重复
            2.遍历nums1，把其值放入HashMap中，并将value设置为1
            3.新建ArrayList，稍后存储重复的值
            4.遍历nums2，用其值取尝试从map中获取value
            5.如果不能获取，说明map中没有，即为null
            6.如果能获取，查看value是否是1，如果是1，则表明第一次获取到，即为nums1中重复的，将其添加入list，并将value改为0
            7.如果再次通过nums2的值当作key获取了map中的value，但value为0，说明之前已经获取过了，不再重复加入list
            8.新建一个数组（以list的size为长度），遍历list，将其值存入int数组
            9.返回数组，整个BigO为 3N
        */
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums2) {
            if (map.get(i) != null && map.get(i) > 0) {
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] ret = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ret[i] = list.get(i);
        }
        return ret;
    }

    public int[] intersect_sorted(int[] nums1, int[] nums2) {
        /*
        1.将两个输入数组排序，此时产生 nlogN
        2.一个循环循环两个数组
        3.因为已经排序，所以直接通过比大小判断是否交集
        4.哪个数组值小，就挪一个，继续比
        5.一直比到其中一个数组到头。
        6.ArrayList转int数组，返回
         */
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int n = nums1.length, m = nums2.length;
        int i = 0, j = 0;
        List<Integer> list = new ArrayList<>();
        while (i < n && j < m) {
            int a = nums1[i], b = nums2[j];
            if (a == b) {
                list.add(a);
                i++;
                j++;
            } else if (a < b) {
                i++;
            } else {
                j++;
            }
        }
        int[] ret = new int[list.size()];
        for (int k = 0; k < list.size(); k++) ret[k] = list.get(k);
        return ret;
    }
}
