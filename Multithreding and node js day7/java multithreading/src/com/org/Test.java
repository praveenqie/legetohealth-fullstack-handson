package com.org;

public class Test implements Runnable {

	public void demo() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Thread is running with "+i+":"+Thread.currentThread().getName());
		}
	}

	public void run() {
		demo();
	}

}
