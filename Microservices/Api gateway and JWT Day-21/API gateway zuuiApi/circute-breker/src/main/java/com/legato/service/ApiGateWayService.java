package com.legato.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.stereotype.Service;

import com.legato.bean.Client;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;


@Service
public class ApiGateWayService {
	
	@Autowired
	private Client client;
	
	
	@CircuitBreaker(name = "fetchfirstapp",fallbackMethod = "appHandler")
	public String getApi() {
		return client.firstApi();
	}
	public String appHandler(Throwable throwable) {
		return "Alternative response from callback method";
		
	}

}
