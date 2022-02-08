package com.legato.clentserver.service;

import java.util.List;

import com.legato.clentserver.bean.Customers;
import com.legato.clentserver.exception.ClientAppException;

public interface CustomerService {
	
	public List<Customers> fetchAll() throws ClientAppException;
	
	public Customers saveCustomers(Customers customers);
	
	public Customers fecthCustomerById(Integer customerID);
	
	public void deleteCustomers(Integer customerId);

}
