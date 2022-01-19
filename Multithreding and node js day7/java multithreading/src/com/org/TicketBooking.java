package com.org;

public class TicketBooking implements Runnable{
	
	public static int availability = 1;
	
	
	public synchronized void bookTicket() {
		String tname = Thread.currentThread().getName();
		
		if(availability != 0) {
			System.out.println("thread got the ticket  :"+tname);
			availability--;
		}else {
			System.out.println("Thread did not get a ticket  :"+tname);
		}
		
		
	}
	
	public void run() {
		bookTicket();
	}

}
