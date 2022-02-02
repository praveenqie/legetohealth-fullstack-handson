package com.org.service;

import org.springframework.stereotype.Repository;

import com.org.dao.EmployeeDao;

@Repository
public class EmployeeJDBCImpl implements EmployeeDao{

	
	private EmployeeDao dao;


	public void setDao(EmployeeDao dao) {
		this.dao = dao;
	}

	EmployeeJDBCImpl()
	{
		System.out.println("JDBC called");
	}
	
	@Override
	public void store() {
		System.out.println("JDBC store called");
		
	}

	@Override
	public void remove() {
		System.out.println("JDBC remove called");
		
	}
}
