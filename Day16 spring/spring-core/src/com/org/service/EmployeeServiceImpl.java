package com.org.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.org.dao.EmployeeDao;

public class EmployeeServiceImpl {
	
	private EmployeeDao dao;
	
	
	@Autowired
	public EmployeeServiceImpl(EmployeeDao employeeDao) {
		this.dao = employeeDao;
	}
	

	public void store() {
		System.out.println("Service store called");
		dao.store();
		
	}

	
	public void remove() {
		System.out.println("Service remove called");
		dao.remove();
		
	}


	



}
