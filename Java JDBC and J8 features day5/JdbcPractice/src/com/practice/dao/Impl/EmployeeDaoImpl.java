package com.practice.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.practice.beans.Employee;
import com.practice.dao.DBUtils;
import com.practice.dao.EmployeeDao;
import com.practice.exception.EmployeeNotFoundException;

public class EmployeeDaoImpl implements EmployeeDao {

	public int store(Employee employee) {
		int status = -1;
		try {

			Connection connection = DBUtils.getConnection();

			String query = "insert into employee(name, salary) values(?, ?)";
			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, employee.getEmpName());
			statement.setDouble(2, employee.getEmpSalary());
			status = statement.executeUpdate();
			ResultSet resultSet = 	statement.getGeneratedKeys();
			statement.close();
			connection.close();
			return resultSet.getInt(1);
			

			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return status;
	}

	public Employee findById(int empId) throws EmployeeNotFoundException {
		Employee employee = null;
		try {
			Connection connection = DBUtils.getConnection();
			String query = "select * from employee where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setInt(1, empId);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
			}
			result.close();
			statement.close();
			connection.close();
			if (employee == null) {
				// throw checked exception & propagate to caller
				throw new EmployeeNotFoundException("Sorry, " + empId + " not found");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employee;
	}

	@Override
	public List<Employee> findAll() throws EmployeeNotFoundException {
		Employee employee = null;
		List<Employee> employees = new ArrayList<Employee>();
		try {
			Connection connection = DBUtils.getConnection();
			String query = "select * from employee";
			PreparedStatement statement = connection.prepareStatement(query);
			ResultSet result = statement.executeQuery();
			while (result.next()) {
				employee = new Employee(result.getInt(1), result.getString(2), result.getDouble(3));
				employees.add(employee);
			}
			if(Objects.isNull(employees) || employees.isEmpty()) {
				throw new EmployeeNotFoundException("Employees is no available in database");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return employees;
	}

	@Override
	public void update(int id, double salary) throws EmployeeNotFoundException {
		Employee employee = findById(id);
		if(Objects.isNull(employee)) {
			throw new EmployeeNotFoundException("Employees not found");
		}
		 
		try {
			Connection connection = DBUtils.getConnection();
			String query = "update employee set salary = ? where id = ?";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setDouble(1,salary);
			statement.setInt(2, id);
			int result = statement.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
