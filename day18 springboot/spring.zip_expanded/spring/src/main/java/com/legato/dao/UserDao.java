package com.legato.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.legato.beans.User;

@Repository
public interface UserDao extends JpaRepository<User, Integer>{
	
	

}
