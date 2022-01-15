package com.activity;

public interface EmployeeStorage {

	public int save(Employee employee) throws EmployeeNotFoundException;

	public Employee findEmployee(int id) throws EmployeeNotFoundException;

	public Employee[] findEmployees() throws EmployeeNotFoundException;

	public void delete(int id) throws EmployeeNotFoundException;

}
