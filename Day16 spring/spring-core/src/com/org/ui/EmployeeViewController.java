package com.org.ui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.org.service.EmployeeJDBCImpl;

public class EmployeeViewController {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
		
		EmployeeJDBCImpl employeeJDBCImpl = (EmployeeJDBCImpl)applicationContext.getBean("empService");
		employeeJDBCImpl.store();	
		ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext)applicationContext;
		context.close();
	}

}
