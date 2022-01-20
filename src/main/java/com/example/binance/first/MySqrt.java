package com.example.binance.first;

/**
 * @className: MySqrt
 * @description: 平方根
 * @author: Yang Naihua
 * @create: 2022-01-20 13:59
 **/
public class MySqrt {
    private static float baseNumber;

    public static float sqrt(float input) {

        float result = Math.round((input + baseNumber / input) / 2f * 1000f) / 1000f;

        if (result == input) {
            return input;
        }
        return sqrt(result);


    }

    public static void main(String[] args) {
        float input = 2f;
        baseNumber = input;
        System.err.println(sqrt(input));

    }
}