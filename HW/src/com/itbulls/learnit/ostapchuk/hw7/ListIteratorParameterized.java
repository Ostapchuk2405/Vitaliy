package com.itbulls.learnit.ostapchuk.hw7;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface ListIteratorParameterized<T> extends Iterator<T> {

	@Override
	void remove();

	boolean hasPrevious();

	T previous();

	void set(T e);

}
