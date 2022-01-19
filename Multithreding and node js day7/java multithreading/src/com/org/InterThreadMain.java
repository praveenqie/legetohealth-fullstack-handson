package com.org;

public class InterThreadMain {

	public static void main(String[] args) {
		InterThread interThread = new InterThread();
		
		Thread thread1= new Thread(interThread,"t1");
		Thread thread2= new Thread(interThread,"t2");
		Thread thread3= new Thread(interThread,"t3");
		Thread thread4= new Thread(interThread,"t4");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		
		System.out.println("Thread ends here.......");

	}

}
