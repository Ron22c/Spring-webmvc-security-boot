package com.cranajit.streammusic.daos;

import java.util.List;

import com.cranajit.streammusic.models.User;

public interface UserDAO {
	User getUser(long id);

	List<User> getUsers();

	User addUser(User user);

	User updateUser(User user);

	long deleteUser(long id);
}
