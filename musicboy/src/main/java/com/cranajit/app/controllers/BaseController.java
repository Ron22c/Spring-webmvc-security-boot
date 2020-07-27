package com.cranajit.app.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cranajit.app.models.UserModel;

@Controller
public class BaseController {

	@ResponseBody
	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
	public UserModel getWelcome() {
		return new UserModel("Ranajit", "rjc2aug@gmail.com");
	}
}
