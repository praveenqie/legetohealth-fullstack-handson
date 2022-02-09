package com.legato.bean;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FIRSTAPP/myfirstapp")
public interface Client {
	
	@GetMapping(path = "/api")
	public String firstApi();
	
}