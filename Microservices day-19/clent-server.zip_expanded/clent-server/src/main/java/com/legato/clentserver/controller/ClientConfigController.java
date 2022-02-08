package com.legato.clentserver.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legato.clentserver.bean.UserBean;

@RestController
@RequestMapping("config")
public class ClientConfigController {

	@Autowired
	private UserBean bean;

	@GetMapping(path = "userdata")
	public ResponseEntity<Object> getPort() {
		System.out.println("Client application calling");
		return ResponseEntity.status(HttpStatus.OK).body("Name :" + bean.getName() + "Password :" + bean.getPassword());
	}

}
