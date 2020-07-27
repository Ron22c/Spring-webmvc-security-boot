package com.cranajit.books.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cranajit.books.models.User;
import com.cranajit.books.services.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@GetMapping("/user/{id}")
	public ResponseEntity<User> get(@PathVariable("id") long id) {
		User user = userService.get(id);
		return ResponseEntity.ok().body(user);
	}
}
