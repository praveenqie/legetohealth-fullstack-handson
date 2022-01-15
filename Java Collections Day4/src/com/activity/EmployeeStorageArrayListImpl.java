package com.activity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeStorageArrayListImpl implements EmployeeStorage {

	List<Employee> employees = new ArrayList<Employee>();

	@Override
	public int save(Employee employee) throws EmployeeNotFoundException {
		System.out.println("--------------------------ArrayList collection calling--------------------------");
		if (!Objects.isNull(employees)) {
			for (Employee employee2 : employees)
				if (employee2.getId() == employee.getId())
				throw new EmployeeNotFoundException("Employee already exist");
		}
		employees.add(employee);
		return employee.getId();
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		System.out.println("--------------------------ArrayList collection calling--------------------------");
		if (!Objects.isNull(employees)) {
			for (Employee employee2 : employees)
				if (employee2.getId() == id)
					return employee2;
		}
		throw new EmployeeNotFoundException("Employee not found");
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		System.out.println("--------------------------ArrayList collection calling--------------------------");
		if (!Objects.isNull(employees)) {
			for (Employee employee2 : employees)
				if (employee2.getId() == id)
					employees.remove(employee2);
		}

	}

	@Override
	public Employee[] findEmployees() {
		System.out.println("--------------------------ArrayList collection calling--------------------------");
		Employee[] employeesArray =  employees.toArray(new Employee[0]);
		return employeesArray;
	}

}
