package com.org;

public class TicketBookingMain {
	public static void main(String[] args) {
		
		TicketBooking booking = new TicketBooking();
		Thread thread1= new Thread(booking,"t1");
		Thread thread2= new Thread(booking,"t2");
		Thread thread3= new Thread(booking,"t3");
		Thread thread4= new Thread(booking,"t4");
		thread1.setDaemon(true);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		System.out.println("Thread ends here.......");
		
	}

}
