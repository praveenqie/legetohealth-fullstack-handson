package com.exceptionpractice;

import java.util.Scanner;

public class PracticeException {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			int[] data = { 2, 3, 5, 1, 7, 9 };

			System.out.println("Enter a");
			int a = sc.nextInt();

			System.out.println("Enter b");
			int b = sc.nextInt();

			int c = a / b;

			System.out.println("Result :" + c);
			System.out.println("Data at postion " + c + "is" + data[c]);

		} catch (ArrayIndexOutOfBoundsException e) {

		} catch (ArithmeticException e) {

		} catch (Exception e) {

		} finally {
			System.out.println("Finally block is excicuted");
			sc.close();
		}
		System.out.println("End of the program");
	}

}
