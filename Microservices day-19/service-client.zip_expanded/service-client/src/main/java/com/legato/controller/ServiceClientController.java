package com.legato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("serviceapp")
public class ServiceClientController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping
	public ResponseEntity<Object> serviceRequest(){
		return ResponseEntity.status(HttpStatus.OK).body("greetings from service");
	}
	
	
	@GetMapping("client")
	public ResponseEntity<Object> callFirstApp(){
		
		String url = "http://FIRSTAPP/myfirstapp";
		String data = restTemplate.getForObject(url, String.class);
		return ResponseEntity.status(HttpStatus.OK).body("called api from firstapp"+data);
	}
	

}
