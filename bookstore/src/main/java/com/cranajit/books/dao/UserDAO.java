package com.cranajit.books.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.cranajit.books.models.User;

@Component
@Transactional
public interface UserDAO {
	long save(User user);

	User get(long id);

	List<User> list();

	void update(long id, User user);

	void delete(long id);
}
