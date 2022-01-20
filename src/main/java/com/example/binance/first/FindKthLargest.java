package com.example.binance.first;

import java.util.PriorityQueue;

/**
 * @className: FindKthLargest
 * @description: 无序数组最大
 * @author: Yang Naihua
 * @create: 2022-01-20 10:31
 **/
public class FindKthLargest {
    private final static Integer capacity = 5;
    private final static Integer length = 10;

    public static int findLargest(int[] base, int order) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue();
        for (int baseNumber : base) {
            priorityQueue.add(baseNumber);
            if (priorityQueue.size() > order) {
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }


    public static void main(String[] args) {
        int[] base = new int[length];
        for (int i = 0; i < length; i++) {
            base[i] = i;
        }
        base[8] = 3;

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < length; i++) {
            stringBuilder.append(base[i] + " ");
        }
        System.err.println(stringBuilder);

        System.err.println(findLargest(base, capacity));
    }
}