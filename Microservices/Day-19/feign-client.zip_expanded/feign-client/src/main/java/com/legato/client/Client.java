package com.legato.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("FIRSTAPP/myfirstapp")
public interface Client {
	
	@GetMapping
	public String getGreeting();
	
	@GetMapping(path = "/welcome")
	public String getWelcome();
	
}
