package com.cranajit.streammusic.services;

import java.util.List;

import com.cranajit.streammusic.models.User;

public interface UserService {
	User getUser(long id);

	List<User> getUsers();

	User addUser(User user);

	User updateUser(User user);

	long deleteUser(long id);
}
