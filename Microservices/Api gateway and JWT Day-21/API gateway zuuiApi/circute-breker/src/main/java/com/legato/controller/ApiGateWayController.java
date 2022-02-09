package com.legato.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legato.service.ApiGateWayService;

@RestController
@RequestMapping("apigateway")
public class ApiGateWayController {
	
	@Autowired
	private ApiGateWayService apiGateWayService;
	
	
	@GetMapping
	public ResponseEntity<Object> callApi() {
		return ResponseEntity.status(HttpStatus.OK).body(apiGateWayService.getApi());
	}

}
