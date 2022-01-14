package com.activity;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EmployeeStorageHashsetImpl implements EmployeeStorage {

	Set<Employee> employees = new HashSet<Employee>();

	@Override
	public int save(Employee employee) {
		System.out.println("--------------------------Hash set collection calling--------------------------");
		if (!Objects.isNull(employees)) {
			for (Employee employee2 : employees)
				if (employee2.getId() == employee.getId())
					return -1;
		}
		employees.add(employee);
		return employee.getId();
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		System.out.println("--------------------------Hash set collection calling--------------------------");
		if (!Objects.isNull(employees)) {
			for (Employee employee2 : employees)
				if (employee2.getId() == id)
					return employee2;
		}
		throw new EmployeeNotFoundException("Employee not found");
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		System.out.println("--------------------------Hash set collection calling--------------------------");
		if (!Objects.isNull(employees)) {
			for (Employee employee2 : employees)
				if (employee2.getId() == id)
					employees.remove(employee2);
		}

	}

	@Override
	public Employee[] findEmployees() {
		System.out.println("--------------------------Hash set collection calling--------------------------");
		Employee[] employeesArray =  employees.toArray(new Employee[0]);
		return employeesArray;
	}

}
