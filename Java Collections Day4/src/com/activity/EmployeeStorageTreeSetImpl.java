package com.activity;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeStorageTreeSetImpl implements EmployeeStorage{
	Set<Employee> employees = new TreeSet<Employee>();

	@Override
	public int save(Employee employee) {
		System.out.println("--------------------------Tree set collection calling--------------------------");
		employees.add(employee);
		return employee.getId();
	}

	@Override
	public Employee findEmployee(int id) throws EmployeeNotFoundException {
		System.out.println("--------------------------Tree set collection calling--------------------------");
		if (!Objects.isNull(employees)) {
			for (Employee employee2 : employees)
				if (employee2.getId() == id)
					return employee2;
		}
		throw new EmployeeNotFoundException("Employee not found");
	}

	@Override
	public void delete(int id) throws EmployeeNotFoundException {
		System.out.println("--------------------------Tree set collection calling--------------------------");
		if (!Objects.isNull(employees)) {
			for (Employee employee2 : employees)
				if (employee2.getId() == id)
					employees.remove(employee2);
		}

	}

	@Override
	public Employee[] findEmployees() throws EmployeeNotFoundException {
		System.out.println("--------------------------Tree set collection calling--------------------------");
	
		Employee[] employeesArray =  employees.toArray(new Employee[0]);
		if(employeesArray == null)
			throw new EmployeeNotFoundException("Employee not found exception");
		return employeesArray;
	}

}
