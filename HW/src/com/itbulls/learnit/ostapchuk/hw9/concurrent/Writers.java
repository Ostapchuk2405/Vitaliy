package com.itbulls.learnit.ostapchuk.hw9.concurrent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Writers {

	private static final int ITERARION_NUMBER = 3;
	private static final int READERS_NUMBER = 3;
	private static final StringBuilder BUFFER = new StringBuilder();
	private static final int BUFFER_LENGHT = 5;
	private static final int PAUSE = 5;
	private static boolean stop;
	private static boolean isWrittenToBuffer;
	private static volatile int readersRead = READERS_NUMBER;
	private static final Object MONITOR = new Object();

	private static class Reader extends Thread {

		@Override
		public void run() {
			while (!stop) {
				if (readersRead == 0) {
					try {
						synchronized (MONITOR) {
							read(getName());
							if (readersRead == READERS_NUMBER) {
								isWrittenToBuffer = false;
								MONITOR.notifyAll();
							}
						}
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}

		private static void read(String threadName) throws InterruptedException {
			System.out.printf("Reader %s:", threadName);
			for (int j = 0; j < BUFFER_LENGHT; j++) {
				Thread.sleep(PAUSE);
				System.out.print(BUFFER.charAt(j));
			}
			System.out.println();
			readersRead++;
			Thread.sleep(5);
		}
	}

	private static class Writer extends Thread {

		@Override
		public void run() {
			int tact = 0;
			while (!stop) {
				try {
					synchronized (MONITOR) {
						write();
						while (isWrittenToBuffer) {
							MONITOR.wait();
						}
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				} finally {
					if (++tact == ITERARION_NUMBER) {
						stop = true;
					}
				}
			}
		}

		private static void write() throws InterruptedException {
			BUFFER.setLength(0);
			System.err.print("WRITER WRITES:");
			Random random = new Random();
			for (int j = 0; j < BUFFER_LENGHT; j++) {
				Thread.sleep(PAUSE);
				char ch = (char) ('A' + random.nextInt(26));
				System.err.print(ch);
				BUFFER.append(ch);
			}
			System.err.println();
			Thread.sleep(5);
			isWrittenToBuffer = true;
			readersRead = 0;
		}
	}

	public static void main(String[] args) throws InterruptedException {

		Writer writer = new Writer();
		List<Thread> readers = new ArrayList<>();
		for (int j = 0; j < READERS_NUMBER; j++) {
			readers.add(new Reader());
		}
		Thread.sleep(10);
		for (Thread reader : readers) {
			reader.start();
		}
		Thread.sleep(10);
		writer.start();
		writer.join();

		for (Thread reader : readers) {
			reader.join();
		}
	}
}
