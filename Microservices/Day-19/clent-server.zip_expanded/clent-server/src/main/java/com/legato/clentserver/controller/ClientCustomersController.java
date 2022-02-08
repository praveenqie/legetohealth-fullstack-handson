package com.legato.clentserver.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legato.clentserver.bean.Customers;
import com.legato.clentserver.exception.ClientAppException;
import com.legato.clentserver.service.CustomerService;

@RestController
@RequestMapping("customer")
public class ClientCustomersController {
	
	@Autowired
	private CustomerService customerService;
	
	@SuppressWarnings("unchecked")
	@GetMapping(path = "/hello")
	public ResponseEntity<Object> hello(){
	return ResponseEntity.status(200).body("api is working");
		
	}
	
	
	@SuppressWarnings("unchecked")
	@GetMapping(path = "getCustomers")
	public ResponseEntity<Object> fetchAllCutsomers(){
		try {
			return ResponseEntity.status(HttpStatus.OK).body(customerService.fetchAll());
		} catch (ClientAppException e) {
			return ResponseEntity.status(500).body(e.getMessage());
		}
	
		
	}

}
