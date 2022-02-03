package com.legatohealth.service;

import java.util.List;

import com.legatohealth.beans.User;

public interface UserService {
	public void storeUser(User user);
	public User findUser(int userId);
	public List<User> findAllUsers();
	public void deleteUser(int userId);
	public void updateName(int userId, String name);
	public void updatePassword(int userId, String password);
	public void updateAge(int userId, int age);
}
