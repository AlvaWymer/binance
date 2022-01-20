package com.example.binance.demo;

/**
 * @className: MySqrt
 * @description:
 * @author: Yang Naihua
 * @create: 2022-01-19 14:22
 **/
public class MySqrt {
    private static float baseNumber;

    public static void main(String[] args) {
        System.err.println(mySqrt(4f));
//        System.err.println(mySqrt2(2f));
    }

    public static float mySqrt(float enterNumber) {
        baseNumber = enterNumber;
        if (enterNumber == 0) return 0;
        return ((sqrts(enterNumber)));
    }

    // 牛顿迭代法
    public static float sqrts(float enterNumber) {
        float res = (Math.round((enterNumber + baseNumber / enterNumber) / 2 * 1000)) / 1000;
        if (res == enterNumber) {
            return enterNumber;
        } else {
            return sqrts(res);
        }
    }
}