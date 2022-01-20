package com.example.binance.first;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * @className: Intersection
 * @description: 求两个数组的交集
 * @author: Yang Naihua
 * @create: 2022-01-20 13:30
 **/
public class Intersection {

    public static int[] same(int[] a, int[] b) {
        Set<Integer> setA = Arrays.stream(a).boxed().collect(Collectors.toSet());
        return Arrays.stream(b).distinct().filter(setA::contains).toArray();

    }

    public static void main(String[] args) {

        int[] a = new int[10];
        for (int i = 0; i < 10; i++) {
            a[i] = i;
        }

        int[] b = new int[5];
        for (int i = 0; i < 5; i++) {
            b[i] = i;
        }

        System.err.println(Arrays.stream(same(a, b)).boxed().collect(Collectors.toList()));
    }
}