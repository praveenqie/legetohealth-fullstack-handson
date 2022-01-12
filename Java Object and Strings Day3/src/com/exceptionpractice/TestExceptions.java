
package com.exceptionpractice;

import java.util.Scanner;

@SuppressWarnings("serial")
class AgeValidateException extends Exception{
	AgeValidateException(){
		super("Age is invalid");
	}
	AgeValidateException(String msg){
		super(msg);
	}
}

public class TestExceptions {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int age = sc.nextInt();
		
		try {
			validateAge(age);
		} catch (Exception e) {
		}
	}

	private static void validateAge(int age) throws AgeValidateException {
		if(age <18 || age>60) {
			throw new AgeValidateException("Entered age is invalid"+age+"dd");
		}
		
	}

}
