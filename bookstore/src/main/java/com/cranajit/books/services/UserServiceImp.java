package com.cranajit.books.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cranajit.books.dao.UserDAO;
import com.cranajit.books.models.User;

@Component
public class UserServiceImp implements UserService {
	
	@Autowired
	private UserDAO userDAO;

	@Override
	public long save(User user) {
		return userDAO.save(user);
	}

	@Override
	public User get(long id) {
		return userDAO.get(id);
	}

	@Override
	public List<User> list() {
		return userDAO.list();
	}

	@Override
	public void update(long id, User user) {
		userDAO.update(id, user);
	}

	@Override
	public void delete(long id) {
		userDAO.delete(id);
	}

}
