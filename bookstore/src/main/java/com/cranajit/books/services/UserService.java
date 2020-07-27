package com.cranajit.books.services;

import java.util.List;

import org.springframework.stereotype.Component;

import com.cranajit.books.models.User;

@Component
public interface UserService {
	long save(User user);

	User get(long id);

	List<User> list();

	void update(long id, User user);

	void delete(long id);
}
