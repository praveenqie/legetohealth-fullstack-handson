package com.legatohealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legatohealth.beans.User;
import com.legatohealth.dao.UserDao;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao; // injects the UserDao implementation object
	@Override
	public void storeUser(User user) {
		userDao.store(user);
	}

	@Override
	public User findUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateName(int userId, String name) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePassword(int userId, String password) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAge(int userId, int age) {
		// TODO Auto-generated method stub

	}

}
