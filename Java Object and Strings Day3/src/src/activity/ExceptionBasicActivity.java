package src.activity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("serial")
class ExampleException extends Exception {
	public ExampleException() {
		super("Example exception called .......");
	}

	public ExampleException(String error) {
		super(error);
	}

}

public class ExceptionBasicActivity {

	public static void main(String[] args) throws ExampleException {

		Scanner sc = new Scanner(System.in);
		String[] Employees = { "Naveen", "Nithin", "Navneeth", "Rakshath", "Nischitha" };

		System.out.println("Enter a value for A:");
		int a = sc.nextInt();

		System.out.println("Enter a Value for B:");
		int b = sc.nextInt();
		divide(a, b, Employees);
		
		
		System.out.println("Enter emplyee name");
		String emp = sc.nextLine();
		checkEmployeeExists(emp,Employees);

		
	}

	private static void checkEmployeeExists(String emp, String[] employees) throws ExampleException {
		
		ArrayList<String> employeeList = (ArrayList<String>) Arrays.asList(employees);
		
		if(employeeList.contains(emp)) 
			throw new ExampleException("Employee already exists");
		else 
			employeeList.add(emp);
	}

	private static void divide(int a, int b, String[] Employees) {

		try {
			int results = a / b;
			System.out.println(results);
			try {
				System.out.println(Employees[results]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Index is not found in the String array");
			}
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception occured ..");
		} finally {
			System.out.println("Finally block is exccuted ");
		}
	}

}
