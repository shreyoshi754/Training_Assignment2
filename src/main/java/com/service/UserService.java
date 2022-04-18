package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserDao;
import com.entity.Login;
import com.entity.User;


@Service
public class UserService {
	
	@Autowired
	UserDao userRepository;
	
	public void register(User user){
	
		userRepository.register(user);
	}	
	
	public User validateUser(Login user) {
		return userRepository.validateUser(user);
	}

}
