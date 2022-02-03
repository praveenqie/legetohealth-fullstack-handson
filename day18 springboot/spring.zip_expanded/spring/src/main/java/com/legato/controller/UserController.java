package com.legato.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.legato.Exceptions.UsersExceptions;
import com.legato.beans.User;
import com.legato.service.UserService;

@RestController
@RequestMapping("api")
public class UserController {

	@Autowired
	private UserService service;

	@PostMapping(path = "/user",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> save(@RequestBody User user) {
		User user2 = service.save(user);
		return ResponseEntity.status(HttpStatus.OK).body(user2);
	}

	@GetMapping(path = "/user/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> fetchUser(@PathVariable("id")int id) throws UsersExceptions {
		User user = service.fetchUser(id);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}

	@DeleteMapping(path = "/user/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> deleteUser(int id) throws UsersExceptions {
		try {
			service.deleteUser(id);
			return ResponseEntity.status(HttpStatus.OK).body("ss");
		} catch (UsersExceptions e) {
			// TODO Auto-generated catch block
			return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Bad Request");
		}
	}

	@GetMapping(path = "/userlist")
	public ResponseEntity<Object> fetchAllUser() throws UsersExceptions {
		try {
			List<User> users = service.fetchAllUser();
			return ResponseEntity.status(HttpStatus.OK).body(users);
		} catch (UsersExceptions e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.OK).body("not able to find users list");
		}
	}

	@PutMapping(path = "/update",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updatePassword(int id, String password) throws UsersExceptions {
		try {
			User user =  service.updatePassword(id, password);
			return ResponseEntity.status(HttpStatus.OK).body(user);
		} catch (UsersExceptions e) {
			// TODO Auto-generated catch block
			return ResponseEntity.status(HttpStatus.OK).body("user password updated succesfully");
		}
	}
	

	@PutMapping(path = "/updateAll",consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> updateUser(@RequestBody User user) throws UsersExceptions {
		try {
			User user2 =  service.updateUser(user);
			return ResponseEntity.status(HttpStatus.OK).body(user2);
		} catch (UsersExceptions e) {
			return ResponseEntity.status(HttpStatus.OK).body("user data updates successfully");
		}
	}

}
