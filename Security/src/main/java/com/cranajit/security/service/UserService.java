package com.cranajit.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cranajit.security.model.User;
import com.cranajit.security.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public User addUser(User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		User userOne = userRepository.addUser(user);
		return userOne;
	}
	
	public User findUserByName(String username) {
		User user = userRepository.findByUserName(username);
		if (user != null) {
			user.setPassword(null);
			return user;
		}
		return null;
	}
}
