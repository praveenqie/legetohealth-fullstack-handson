package com.activity;

import java.util.Scanner;

public class EmployeeUiController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Select the collection implementation");
		System.out.println("1.Arraylist Implementation\r\n2.Hashset Implementation \r\n3.Treeset Implementation");
		int implSection = sc.nextInt();

		EmployeeStorageFactoryPattern employeeStorageFactoryPattern = new EmployeeStorageFactoryPattern();
		EmployeeStorage employeeStorage = employeeStorageFactoryPattern.getEmployeeImpl(implSection);
		chooseEmployeeAction(sc, employeeStorage);
		sc.close();
	}

	private static void perfromEmployeeActions(int employeeAction, Scanner sc, EmployeeStorage employeeStorage) {
		switch (employeeAction) {
		case 1:
			System.out.println("Enter the employee details");
			System.out.println("Enter an employee id");
			int id = sc.nextInt();
			System.out.println("Enter an employee name");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Enter an employee salery");
			double salery = sc.nextDouble();
			Employee employee = new Employee(id, name, salery);
			employeeStorage.save(employee);
			break;
		case 2:
			System.out.println("Enter an employee id to find");
			int empId = sc.nextInt();
			try {
				Employee employee2 = employeeStorage.findEmployee(empId);
				System.out.println("Name : " + employee2.getName() + "employee id " + employee2.getId()
						+ "Employee salery" + employee2.getSalery());
			} catch (EmployeeNotFoundException e) {
				e.printStackTrace();
			} finally {
				chooseEmployeeAction(sc, employeeStorage);
			}
			break;
		case 3:
			Employee[] employees;
			try {
				employees = employeeStorage.findEmployees();
				for (Employee employee3 : employees)
					System.out.println("Name: " + employee3.getName() + " || employee id:" + employee3.getId()
							+ " || Employee salery:" + employee3.getSalery());
				System.out.println("----------");
			} catch (EmployeeNotFoundException e1) {
				e1.printStackTrace();
			} finally {
				chooseEmployeeAction(sc, employeeStorage);
			}

			break;
		case 4:
			System.out.println("Enter the employee id to delete :");
			int empid = sc.nextInt();
			try {
				employeeStorage.delete(empid);
				System.out.println("Employee deleted succefully");
			} catch (EmployeeNotFoundException e) {
				e.printStackTrace();
			} finally {
				chooseEmployeeAction(sc, employeeStorage);
			}
			break;
		default:
			break;
		}

	}

	private static void chooseEmployeeAction(Scanner sc, EmployeeStorage employeeStorage) {
		System.out.println("Choose employee action");
		System.out.println(
				"1.Store\r\n" + "2.Find by id\r\n" + "3.Find all\r\n" + "4.Delete by id\r\n" + "5.Exit\r\n" + "");
		int results = sc.nextInt();
		if (results != 5) {
			perfromEmployeeActions(results, sc, employeeStorage);
			chooseEmployeeAction(sc, employeeStorage);
		}
		
	}

}
