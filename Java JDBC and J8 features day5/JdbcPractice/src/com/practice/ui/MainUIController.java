package com.practice.ui;

import java.util.List;
import java.util.Scanner;

import com.practice.beans.Employee;
import com.practice.dao.EmployeeDao;
import com.practice.exception.EmployeeNotFoundException;

import src.practice.factory.EmployeeFactory;

public class MainUIController {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int option = 0;
		EmployeeDao dao = EmployeeFactory.getInstance();
		do {
			System.out.println("Enter below options to perform CRUD operations");
			System.out.println("1: Store employee, 2: Fetch all employees");
			System.out.println("3: Fetch employee by id, 4: Delete employee by id");
			System.out.println("5: Update employee salary by id ");
			System.out.println("7: Fetch all employees,-1: Exit");
			option = scan.nextInt();
			switch(option) {
			case 1:
				System.out.println("Enter name");
				String name = scan.next();
				System.out.println("Enter salary");
				double salary = scan.nextDouble();
				Employee employee = new Employee(0, name, salary);
				int status = dao.store(employee);
				if(status == -1) {
					System.err.println("Employee failed to store");
				} else {
					System.out.println("Employee stored "+status);
				}
				break;
			case 3: 
				System.out.println("Enter id");
				int id = scan.nextInt();
				try {
					employee = dao.findById(id);
					System.out.println(employee);
				} catch (EmployeeNotFoundException e) {
					System.err.println("Error: "+e.getMessage());
				}
				break;
			case 5: 
				System.out.println("Enter id");
				int updateId = scan.nextInt();
				System.out.println("Enter salary");
				double salary1 = scan.nextInt();
				try {
					dao.update(updateId, salary1);
				} catch (EmployeeNotFoundException e) {
					System.err.println("Error: "+e.getMessage());
				}
				break;
			case 7: 
				System.out.println("ALl employees details are listed below");
				try {
					List<Employee> employees = dao.findAll();
					for(Employee employee2 :employees) {
						System.out.println("Employee id:"+employee2.getEmpId()+"||  Employee Name: "+employee2.getEmpName()+"|| Employee Salary :"+employee2.getEmpSalary());
					}
				} catch (EmployeeNotFoundException e) {
					
					System.out.println("Error :"+e.getMessage());
				}
				break;
			}
			
		} while(option != -1);
		
		scan.close();
	}

}
