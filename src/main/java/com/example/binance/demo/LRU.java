package com.example.binance.demo;

import java.util.LinkedList;

/**
 * @author xuls
 * @date 2021/11/14 16:23
 *
 */
public class LRU<T> {
	private LinkedList<T> list;
	private int capacity;   //缓存容量

	public LRU() {
		this(10);
	}

	public LRU(int capacity) {
		this.capacity = capacity;
		list = new LinkedList<>();
	}

	public void add(T data) {
		if (list.size() < capacity) {
			//缓存未满，直接添加到链表头部，表明该数据最近在使用
			list.addFirst(data);
		} else {
			//链表之中是否包含 data
			if (list.contains(data)) {
				//链表包含 data ,先将包含的数据移除
				list.remove(data);
			} else {
				//链表不包含 data ，移除最后一个，因为最后一个是最近最少使用的
				list.removeLast();
			}
			//将新数据添加到前面
			list.addFirst(data);
		}
	}

	@Override
	public String toString() {
		return "LRU{" +
				"list=" + list +
				'}';
	}

	public static void main(String[] args) {
		LRU<String> stringLRU = new LRU<>();
		for (int i = 0; i < 10; i++) {
			stringLRU.add("s" + i);
		}
		System.out.println(stringLRU);
		stringLRU.add("s1");
		System.out.println(stringLRU);
		stringLRU.add("s7");
		System.out.println(stringLRU);
	}
}
