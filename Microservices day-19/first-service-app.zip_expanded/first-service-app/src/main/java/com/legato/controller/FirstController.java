package com.legato.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("myfirstapp")
public class FirstController {
	
	@GetMapping
	public ResponseEntity<Object> greetings(){
		System.out.println("=============greetings is called==========");
		return ResponseEntity.status(HttpStatus.OK).body("greetings");
	}
	
	@GetMapping("/welcome")
	public ResponseEntity<Object> welcome(){
		System.out.println("=========welcome is called============");
		return ResponseEntity.status(HttpStatus.OK).body("welcome");
	}
	

}
