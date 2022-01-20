package com.example.binance.second;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @className: Lru2
 * @description: Lru2
 * @author: Yang Naihua
 * @create: 2022-01-20 14:33
 **/
public class Lru2 {
    private static LinkedList<String> linkedList = new LinkedList();
    private static final Integer capacity = 5;

    public static LinkedList<String> sort(String input) {

        if (linkedList.size() < capacity) {
            linkedList.add(input);
        } else {
            if (linkedList.contains(input)) {
                linkedList.remove(input);
            } else {
                linkedList.removeLast();
            }
            linkedList.addFirst(input);
        }


//       for (String baseInput : input) {
//            if (linkedList.size() < capacity) {
//                linkedList.add(baseInput);
//            }else{
//                if (linkedList.size() > capacity) {
//                    linkedList.removeFirst();
//                }
//                linkedList.addFirst(baseInput);
//            }
//        }


        return linkedList;
    }

    public static void main(String[] args) {
        LinkedList<String> result = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            result = sort("s" + i);
        }
//        base[1] = "s7";


        for (String s : result) {
            System.err.println(s);
        }

        result= new LinkedList<>();
        result= sort("s7");
        for (String s : result) {
            System.err.println(s);
        }

    }
}