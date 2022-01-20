package com.example.binance.second;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * @className: FindKthLargest
 * @description: 查找数组中最大的数
 * @author: Yang Naihua
 * @create: 2022-01-20 14:28
 **/
public class FindKthLargest {

    public static int find(int[] input, int destnation) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int base : input) {
            priorityQueue.add(base);
            if(priorityQueue.size()>destnation){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();

    }

    public static void main(String[] args) {
        int[] input = new int[10];

        for (int i = 0; i < 10; i++) {
            input[i] = i;
        }
        input[5] = 2;

        System.err.println(Arrays.stream(input).boxed().collect(Collectors.toList()));

        System.err.println(find(input, 5));

    }
}