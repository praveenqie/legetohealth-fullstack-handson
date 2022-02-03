package com.legato.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.legato.Exceptions.UsersExceptions;
import com.legato.beans.User;
import com.legato.dao.UserDao;
import com.legato.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public User save(User user) {
		userDao.save(user);
		return user;
	}

	@Override
	public User fetchUser(int id) throws UsersExceptions {
		User user = null;

		Optional<User> optionalUser = userDao.findById(id);
		if (optionalUser.isPresent()) {
			user = optionalUser.get();
		} else {
			throw new UsersExceptions("user not found");
		}
		return user;

	}

	@Override
	public void deleteUser(int id) throws UsersExceptions {
		User user = fetchUser(id);

		userDao.delete(user);

	}

	@Override
	public List<User> fetchAllUser() throws UsersExceptions {
		List<User> allUsers = userDao.findAll();
		if(allUsers.size()<=0) {
			throw new UsersExceptions("No users found");
		}
		return allUsers;
	}

	@Override
	public User updatePassword(int id, String password) throws UsersExceptions {
		User user = fetchUser(id);
		user.setPassword(password);
		userDao.save(user);
		return user;
	}

	@Override
	public User updateUser(User user) throws UsersExceptions {
		User user2 = fetchUser(user.getUserId());
		user2.setAge(user.getAge());
		user2.setName(user.getName());
		user2.setPassword(user.getPassword());
		userDao.save(user2);
		return user2;
	}

}
