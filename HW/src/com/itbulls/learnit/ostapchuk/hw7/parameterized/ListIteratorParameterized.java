package com.itbulls.learnit.ostapchuk.hw7.parameterized;

import java.util.Iterator;
import java.util.NoSuchElementException;

public interface ListIteratorParameterized<T> extends Iterator<T> {

	boolean hasPrevious();

	T previous();

	void set(T e);

	@Override
	void remove();
}