package com.example.binance.third;

import java.util.LinkedList;

/**
 * @className: Lru
 * @description:
 * @author: Yang Naihua
 * @create: 2022-01-18 22:42
 **/
public class Lru<T> {
    private LinkedList<T> linkedList;
    private Integer capacity;

    public Lru() {
        this(10);
    }

    public Lru(Integer capacity) {
        this.capacity = capacity;
        linkedList = new LinkedList<>();
    }

    public void add(T data) {
        if (linkedList.size() < capacity) {
            linkedList.add(data);
        } else {
            if (linkedList.contains(data)) {
                linkedList.remove(data);
            } else {
                linkedList.removeLast();
            }
            linkedList.addFirst(data);
        }
    }

    public static void main(String[] args) {
        Lru<String> stringLru = new Lru<>();
        for (int i = 0; i < 10; i++) {
            stringLru.add("s" + i);
        }

        System.err.println(stringLru.toString());

        stringLru.add("s" + 2);
        System.err.println(stringLru.toString());

        stringLru.add("s" + 8);
        System.err.println(stringLru.toString());


    }

    @Override
    public String toString() {
        return "Lru{" +
                "linkedList=" + linkedList +
                '}';
    }
}