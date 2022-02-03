package com.legatohealth.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.legatohealth.beans.User;
@Repository
public class UserDaoJdbcImpl implements UserDao {
	@Autowired
	private JdbcTemplate jdbc; // because in the xml a bean is configured for JdbcTemplate we can inject it
	@Override
	public void store(User user) {
		String insertQuery = "insert into users (name, password, age) values (?, ?, ?)";
		jdbc.update(insertQuery, user.getName(), user.getPassword(), user.getAge());
	}
	@Override
	public void updateUser(int userId, User user) {
		String updateUserQuery = "update users set name =?, password = ?, age = ? where userid = ?";
		jdbc.update(updateUserQuery, user.getName(), user.getPassword(), user.getAge(), user.getUserId());
	}
	@Override
	public void deleteUser(int userId) {
		String deleteQuery = "delete from users where userid = ?";
		jdbc.update(deleteQuery, userId);
	}
	@Override
	public User fetchUser(int userId) {
		return null;
	}
	@Override
	public List<User> fetchUsers() {
		return null;
	}
}
