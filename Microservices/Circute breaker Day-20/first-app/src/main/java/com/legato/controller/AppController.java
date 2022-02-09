package com.legato.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myfirstapp")
public class AppController {
	
	@GetMapping(path = "/api")
	public String firstApi() {
		return new String("Hello  first app is calling");
	}

}
