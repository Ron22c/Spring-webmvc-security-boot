package com.fwb.controllers;

import java.sql.SQLException;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fwb.models.UserModel;
import com.fwb.services.RegistrationService;

@Controller
public class RegistrationController {
	
	RegistrationService service = new RegistrationService();

	@ResponseBody
	@RequestMapping(value = "/users", method = RequestMethod.POST,
					produces = MediaType.APPLICATION_JSON_VALUE,
					consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserModel addUser(@RequestBody UserModel userinfo) throws SQLException {
		return service.addUser(userinfo);
	}
}
