package com.cranajit.streammusic.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cranajit.streammusic.daos.UserDAO;
import com.cranajit.streammusic.models.User;

@Component
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public User getUser(long id) {
		return userDAO.getUser(id);
	}

	@Override
	public List<User> getUsers() {
		return userDAO.getUsers();
	}

	@Override
	public User addUser(User user) {
		if(userDAO.getUser(user.getId()) == null) {
			return userDAO.addUser(user);
		}
		return null;
	}

	@Override
	public User updateUser(User user) {
		if(userDAO.getUser(user.getId()) != null) {
			return userDAO.updateUser(user);
		}
		return null;
	}

	@Override
	public long deleteUser(long id) {
		if(userDAO.getUser(id) != null) {
			return userDAO.deleteUser(id);
		}
		return -1;
	}

}
