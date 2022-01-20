package com.example.binance.second;

/**
 * @className: MySqrt
 * @description: 平方根
 * @author: Yang Naihua
 * @create: 2022-01-20 20:29
 **/
public class MySqrt {

    public static float sqrt(float input, float baseNumber) {
        if (input == 0) return 0f;

        float finalResult = Math.round((input + baseNumber / input) / 2f * 1000f) / 1000f;
        if (input == finalResult) {
            return finalResult;
        }
        return sqrt(finalResult, baseNumber);
    }

    public static void main(String[] args) {
        float input = 2f;
        float baseNumber = input;
        System.err.println(sqrt(input, baseNumber));

    }
}