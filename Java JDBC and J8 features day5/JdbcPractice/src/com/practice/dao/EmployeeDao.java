package com.practice.dao;

import java.util.List;

import com.practice.beans.Employee;
import com.practice.exception.EmployeeNotFoundException;

public interface EmployeeDao {
	
		public int store(Employee employee);
	
		public Employee findById(int id) throws EmployeeNotFoundException;
	
		public List<Employee> findAll() throws EmployeeNotFoundException;
		
		public void update(int id, double salary)throws EmployeeNotFoundException;
}
