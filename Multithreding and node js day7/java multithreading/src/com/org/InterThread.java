package com.org;

public class InterThread implements Runnable {

	public synchronized void run() {
		String tname = Thread.currentThread().getName();
		System.out.println("Thread Entered ---" + tname);
		for (int i = 1; i <= 10; i++) {

			try {
				System.out.println("Iterated " + tname);
				Thread.sleep(1000);
				if (tname.equals("t1") && i == 5) {
					wait();
				}

			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
		notifyAll();
		System.out.println("Thread went to pause ---" + tname);

	}

	

}
