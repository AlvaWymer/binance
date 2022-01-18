package com.example.binance.first;

import java.util.LinkedList;

/**
 * @className: Lru
 * @description: LRU 缓存淘汰算法
 * @author: Yang Naihua
 * @create: 2022-01-18 15:42
 **/
public class Lru<T> {
    private LinkedList<T> list;
    private Integer capacity;

    public Lru() {
        this(10);
    }


    public Lru(int capacity) {
        this.capacity = capacity;
        list = new LinkedList<T>();
    }

    /**
     * @description: 计算
     * @method calculate
     * @date 2022-01-18 21:34:17
     * @author Yang Naihua
     */
    public void add(T data) {
        if (list.size() < capacity) {
            list.add(data);
        } else {
            //考虑删除整理
            if (list.contains(data)) {
                list.remove(data);
            } else {
                list.removeLast();
            }
            list.addFirst(data);
        }
    }

    @Override
    public String toString() {
        return "Lru{" +
                "list=" + list +
                '}';
    }


    public static void main(String[] args) {
        Lru<String> lrus = new Lru<>();
        for (int i = 0; i < 10; i++) {
            lrus.add("s" + i);
        }

        System.err.println(lrus);

        lrus.add("s5");
        System.err.println(lrus);

        lrus.add("s6");
        System.err.println(lrus);
    }
}