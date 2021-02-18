package com.itbulls.learnit.ostapchuk.hw8.LinkedHashMap;

public interface LruCache {

	int get(int key);

	void put(int key, int value);

	void setCapacity(int capacity);
}
