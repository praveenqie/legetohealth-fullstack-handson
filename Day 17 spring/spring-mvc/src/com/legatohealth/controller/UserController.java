package com.legatohealth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.legatohealth.beans.User;
import com.legatohealth.service.UserService;
/*
 * Controller needs to handle the request and generate the response i.e., view name
 * View must show the dynamic data (Model) i.e., JSP shows some model
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/store", method = RequestMethod.POST)
	public ModelAndView save(@RequestParam("n1") String name, @RequestParam("n2") String password, @RequestParam("n3") int age) {
		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setPassword(password);
		userService.storeUser(user);
		return new ModelAndView("storeSuccess", "msg", "Stored Successfully");
	}
	
	
}
