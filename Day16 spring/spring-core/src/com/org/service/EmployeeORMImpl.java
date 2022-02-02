package com.org.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.org.dao.EmployeeDao;

@Repository
@Primary
public class EmployeeORMImpl implements EmployeeDao{

	EmployeeORMImpl(){
		System.out.println("ORM called");
	}
	
	@Override
	public void store() {
		System.out.println("ORM store called");
		
	}

	@Override
	public void remove() {
		System.out.println("ORM remove called");
		
	}

	
}
