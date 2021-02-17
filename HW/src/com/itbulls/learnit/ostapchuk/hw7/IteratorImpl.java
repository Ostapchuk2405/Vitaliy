package com.itbulls.learnit.ostapchuk.hw7;

import java.util.Iterator;

public class IteratorImpl implements Iterator<Object> {

	int cursor = 0;
	int lastRet = -1;

	@Override
	public boolean hasNext() {
		return cursor != size;
	}

	@Override
	public Object next() {
		Object next = getNodeByIndex(cursor);
		if (next == nuyll) {
			throw new NoSuchElementException();
		}
		lastRet = cursor;
		cursor += 1;
		return next;
	}

	@Override
	public void remove() {
		if (lastRet < 0) {
			throw new IllegalStateException();
		}
		DefaultMyList.this.removeNodeByIndex(lastRet);
		if (lastRet < cursor) {
			cursor--;
		}
		lastRet = -1;
		Iterator.super.remove();
	}

}
