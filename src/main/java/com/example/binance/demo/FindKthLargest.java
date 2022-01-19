package com.example.binance.demo;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @className: FindKthLargest
 * @description: 无需数组第 N 大
 * @author: Yang Naihua
 * @create: 2022-01-18 22:50
 **/
public class FindKthLargest<T> {
    private int[] arrays;
    private Integer index;

    public FindKthLargest() {
        this(13, 5);
    }

    public FindKthLargest(Integer length, Integer index) {
        this.index = index;
        this.arrays = new int[length];
    }

    @Override
    public String toString() {
        return "FindKthLargest{" +
                "arrays=" + Arrays.toString(arrays) +
                ", index=" + index +
                '}';
    }


    public static void main(String[] args) {

        FindKthLargest findKthLargest = new FindKthLargest();

        for (int i = 0; i < 11; i++) {
            findKthLargest.arrays[i] = i;
            findKthLargest.arrays[3] = 2;
//            System.err.println("结果:"+findKthLargest(findKthLargest.arrays, findKthLargest.index));
//            System.err.println(findKthLargest);
//            System.err.println("-------");

        }
        System.err.println("结果:"+findKthLargestQueue(findKthLargest.arrays, findKthLargest.index));
        System.err.println(findKthLargest);
        System.err.println("-------");
    }

    /**
     * @description: 暴力解法
     * @method findKthLargest
     * @date 2022-01-19 11:22:41
     * @author Yang Naihua
     */
    public static int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        Arrays.sort(nums);
        return nums[len - k];
    }

    public static int findKthLargestQueue(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int num : nums) {
            heap.add(num);
            if (heap.size() > k) {
                // 每次都是移除第一个
                heap.poll();
            }
        }
        // 本身是有序的，所以检索出来第一个即可
        return heap.peek();
    }

}