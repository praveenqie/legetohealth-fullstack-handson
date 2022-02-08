package com.legato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legato.client.Client;

@RestController
@RequestMapping("feignclient")
public class FeignClientController {
	
	@Autowired
	private Client client;
	
	@GetMapping(path = "apione")
	public ResponseEntity<Object> getGreeting(){
		return ResponseEntity.status(HttpStatus.OK).body(client.getGreeting());
	}
	@GetMapping(path = "apitwo")
	public ResponseEntity<Object> getWelcome(){
		return ResponseEntity.status(HttpStatus.OK).body(client.getWelcome());
	}
	

}
