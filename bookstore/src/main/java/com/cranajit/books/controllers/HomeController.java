package com.cranajit.books.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cranajit.books.models.User;

@Controller
public class HomeController {
	
	@ResponseBody
	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public User getUser() {
		User user = new User("ranajit", "rjc22aug@gmail.com", 1);
		return user;
	}
}
