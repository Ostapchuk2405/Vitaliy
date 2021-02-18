package com.itbulls.learnit.ostapchuk.hw8.LinkedHashMap;

import java.util.LinkedHashMap;

public class DefaultLruCache extends LinkedHashMap<Integer, Integer> implements LruCache {

	private int capacity;

	public DefaultLruCache() {
		super(16, 0.75f, true);
	}

	public DefaultLruCache(int capacity) {
		super(16, 0.75f, true);
		this.capacity = capacity;
	}

	@Override
	public int get(int key) {
		Integer result = super.get(key);
		if (result == null) {
			return -1;
		}
		return super.get(key);
	}

	@Override
	public void put(int key, int value) {
		super.put(key, value);
	}

	@Override
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public boolean removeEldestEntry(java.util.Map.Entry<Integer, Integer> eldest) {
		if (size() > capacity) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		DefaultLruCache lruCache = new DefaultLruCache(2);
		lruCache.put(1, 1);
		lruCache.put(2, 2);
		System.out.println(lruCache.get(1));
		lruCache.put(3, 3);
		System.out.println(lruCache.get(2));
		lruCache.put(4, 4);
		System.out.println(lruCache.get(1));
		System.out.println(lruCache.get(3));
		System.out.println(lruCache.get(4));
	}

}
