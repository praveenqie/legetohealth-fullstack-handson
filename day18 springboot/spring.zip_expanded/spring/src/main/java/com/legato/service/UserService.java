package com.legato.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.legato.Exceptions.UsersExceptions;
import com.legato.beans.User;


public interface UserService {

	public User save(User user);

	public User fetchUser(int id) throws UsersExceptions;

	public void deleteUser(int id) throws UsersExceptions;

	public List<User> fetchAllUser() throws UsersExceptions;

	public User updatePassword(int id, String password) throws UsersExceptions;
	public User updateUser( User user) throws UsersExceptions;
		

}
