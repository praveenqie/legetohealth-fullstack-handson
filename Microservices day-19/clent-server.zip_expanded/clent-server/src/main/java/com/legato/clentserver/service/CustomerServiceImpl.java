package com.legato.clentserver.service;

import java.util.List;
import java.util.Objects;

import org.apache.catalina.connector.ClientAbortException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.legato.clentserver.bean.Customers;
import com.legato.clentserver.bean.Repository.CustomerRepository;
import com.legato.clentserver.exception.ClientAppException;

@Repository
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customers> fetchAll() throws ClientAppException {
		List<Customers> customers = customerRepository.findAll();
		if(Objects.isNull(customers)) {
			throw new ClientAppException("Customers list doesn't exist");
		}
		if(customers.size()<=0) {
			throw new ClientAppException("Customers list doesn't exist");
		}
	
		return customers;
	}

	@Override
	public Customers saveCustomers(Customers customers) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customers fecthCustomerById(Integer customerID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomers(Integer customerId) {
		// TODO Auto-generated method stub
		
	}

}
