package com.stringexample;

import java.util.Date;

public class TestToString {
	
	public static void main(String[] args) {
		User user = new User("praveen", "26", "male");
		User user2 = new User("nischitha", "23", "female");
		
		System.out.println(user.toString());
		System.out.println(user2);
		
		String s1=new String("test");
		
		String s2 = "hello";
		System.out.println(s1);
		System.out.println(s2);
		Date date = new Date();
		System.out.println(date);
	}

}
