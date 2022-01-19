package com.org;

public class TestThreads {
	public static void main(String[] args) {
		
		Test test = new Test();
		Thread thread1= new Thread(test,"t1");
		Thread thread2= new Thread(test,"t2");
		Thread thread3= new Thread(test,"t3");
		Thread thread4= new Thread(test,"t4");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		System.out.println("Thread ends here.......");
		
		
	}

}
