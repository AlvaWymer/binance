package com.example.binance.demo;

import java.util.Arrays;

/**
 * @className: FindKthLargest
 * @description:
 * @author: Yang Naihua
 * @create: 2022-01-18 22:50
 **/
public class FindKthLargest {
    private int[] arrays;
    private Integer index;

//    public FindKthLargest(){
//        this(5,);
//    }

    public FindKthLargest(int[] arrays, Integer index) {
        this.index = index;
        this.arrays = arrays;
    }

    public static int[] generateRandomArray(int maxSize, int maxValue) {
        // 控制长度maxSize
        // Math.random()   -->[0,1) double   精度有限，所有小数等概率返回
        // Match.random() * A -->[0,A)  double A--->int
        // (int)Match.random() * A -->[0,A-1)   0到 A-1 中间的值

        // 初始化数组的长度
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            // 控制值的范围
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }

    public static void main(String[] args) {

//        int[] ints = generateRandomArray(3, 3);
//        FindKthLargest f = new FindKthLargest(ints, 5);

        for (int i = 0; i < 10; i++) {
            System.err.println( findKthLargest(generateRandomArray(20, 20),2));

        }


    }

    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        System.err.println(nums);
        return nums[len - k];
    }

}