package com.itbulls.learnit.ostapchuk.hw9.concurrent;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Part6 {
	
	static RandomAccessFile raf;
	public static final int COLUMNS = 20;
	public static final int THREADS_NUMBER = 10;
	public static final int EOL_LENGHT = System.lineSeparator().length();
	
	
	public static void main(String[] args) throws IOException {
		
		raf = new RandomAccessFile("part6.txt", "rw");
		ExecutorService es = Executors.newCachedThreadPool();
		for(int i = 0; i < THREADS_NUMBER; i++) {
			es.execute(new Writer(i));
		}
		es.shutdown();
		while (!es.isTerminated()) {
			;
		}
		raf.close();
	}

}
