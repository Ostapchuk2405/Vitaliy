package com.itbulls.learnit.ostapchuk.hw9.concurrent;

import java.util.concurrent.TimeUnit;

public class NameFor5Sec  {
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t = new Thread(new MyThread2());
		t.start();
		TimeUnit.SECONDS.sleep(5);
		t.interrupt();
		
		MyThread t2 = new MyThread();
		t2.start();
		TimeUnit.SECONDS.sleep(5);
		t2.interrupt();
	}
}
	
	
	class MyThread extends Thread{
		
		private static final int PAUSE = 500;

		@Override
		public void run() {
			try {
				while(true) {
					System.out.println(getName());
					TimeUnit.MILLISECONDS.sleep(PAUSE);
				}
			} catch(InterruptedException e){
				System.out.println("THREAD WAS INTERRUPED");
			}
		}
	}
	
	
	class MyThread2 implements Runnable{
		
		private final static int PAUSE = 500;

		@Override
		public void run() {
			try {
				while(true) {
					System.out.println(Thread.currentThread().getName());
					TimeUnit.MILLISECONDS.sleep(PAUSE);
				}
			}catch (InterruptedException e) {
				System.out.println("THREAD WAS INTERRUPTED");
			}
			}
		}
		
		
	}
