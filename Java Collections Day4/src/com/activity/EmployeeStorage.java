package com.activity;

public interface EmployeeStorage {

	public int save(Employee employee);

	public Employee findEmployee(int id) throws EmployeeNotFoundException;

	public Employee[] findEmployees() throws EmployeeNotFoundException;

	public void delete(int id) throws EmployeeNotFoundException;

}
