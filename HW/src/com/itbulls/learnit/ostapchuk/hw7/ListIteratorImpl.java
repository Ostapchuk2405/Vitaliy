package com.itbulls.learnit.ostapchuk.hw7;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class ListIteratorImpl extends IteratorImpl implements ListIterator {

	@Override
	public boolean hasPrevious() {
		return cursor != 0;
	}

	@Override
	public Object previous() {
		cursor -= 1;
		Object previous = getNodeByIndex(cursor);
		if (previous == null) {
			cursor = 0;
			throw new NoSuchElementException();
		}
		lastRet = cursor;
		return previous;

	}

	@Override
	public void set(Object element) {
		if (lastRet < 0) {
			throw new IllegalStateException();
		}
		Node x = getNodeByIndex(lastRet);
		x.data = element;
		lastRet = -1;
	}

}
