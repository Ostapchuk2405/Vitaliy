package com.itbulls.learnit.ostapchuk.hw7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface ListIterator extends Iterator<Object> {

	boolean hasPrevious();

	Object previous();

	void set(Object e);

	@Override
	void remove();

}
