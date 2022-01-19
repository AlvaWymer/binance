package com.example.binance.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @className: Intersection
 * @description: 求两个数组的交集
 * @author: Yang Naihua
 * @create: 2022-01-19 12:26
 **/
public class Intersection {

    public static void main(String[] args) {

        int[] arrays1  = new int[11];
        int[] arrays2  = new int[5];

        for (int i = 0; i < 11; i++) {
            arrays1[i] = i;
        }

        for (int i = 0; i < 5; i++) {
            arrays2[i] = i;
        }

        int[] result = intersection(arrays1,arrays2);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }

//        System.err.println("结果:"+);
//        System.err.println(findKthLargest);
//        System.err.println("-------");
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> list =Arrays.stream(nums1).boxed().collect(Collectors.toList());
        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
//        Set<Integer> set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Arrays.stream(nums2).filter(set::contains).toArray();
        return Arrays.stream(nums2).distinct().filter(set::contains).toArray();

    }
}