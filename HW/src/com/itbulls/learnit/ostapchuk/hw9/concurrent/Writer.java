package com.itbulls.learnit.ostapchuk.hw9.concurrent;

import java.io.IOException;

public class Writer extends Part6 implements Runnable {

	private int id;

	public Writer(int id) {

		this.id = id;
	}

	@Override
	public void run() {
		try {
			writeToFile(findPositionToStart(id), id);
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	private static synchronized void writeToFile(long pos, int element) throws IOException {
		raf.seek(pos);
		for(int i = 0; i < COLUMNS; i++) {
			raf.write(String.valueOf(element).getBytes());
		}
		raf.write(System.lineSeparator().getBytes());
	}

	private static long findPositionToStart(int threadNum) {
		return threadNum * (COLUMNS * EOL_LENGHT);
	}
}
