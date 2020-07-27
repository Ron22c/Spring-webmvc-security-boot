package com.fwb.services;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.fwb.daos.RegistrationDAO;
import com.fwb.models.UserModel;

public class RegistrationService {
	@Autowired
	RegistrationDAO registrationDAO;
	
	public UserModel addUser(UserModel user) throws SQLException {
		return registrationDAO.addUser(user);
	}
}
