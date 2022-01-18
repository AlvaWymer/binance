package com.example.binance.second;

import java.util.LinkedList;

/**
 * @className: Lru
 * @description:
 * @author: Yang Naihua
 * @create: 2022-01-18 22:07
 **/
public class Lru<T> {
    private LinkedList<T> list;
    private Integer capacity;

    public Lru() {
        this(10);
    }

    public Lru(Integer capacity) {
        this.capacity = capacity;
        list = new LinkedList<>();
    }

    public void add(T data) {
        if (list.size() < capacity) {
            list.add(data);
        } else {
            if (list.contains(data)) {
                list.remove(data);
            } else {
                list.removeLast();
            }
            list.addFirst(data);
        }
    }

    public static void main(String[] args) {
        Lru<String> stringLru = new Lru<>();
        for (int i = 0; i < 10; i++) {
            stringLru.add("s"+i);
        }

        System.err.println(stringLru.toString());

        stringLru.add("s"+7);
        System.err.println(stringLru.toString());

        stringLru.add("s"+1);
        System.err.println(stringLru.toString());
    }

    @Override
    public String toString() {
        return "Lru{" +
                "list=" + list +
                '}';
    }
}