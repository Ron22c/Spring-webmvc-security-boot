package com.cranajit.streammusic.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cranajit.streammusic.models.User;
import com.cranajit.streammusic.services.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping(value = "/user/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> getUser(@PathVariable long id) {
		User user = userService.getUser(id);
		if(user != null) {
			return ResponseEntity.ok().body(user);
		}
		return ResponseEntity.notFound().build();
	}
	
	@GetMapping(value = "/users", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<User>> getAllUser() {
		List<User> user = userService.getUsers();
		if(user.size() <= 0) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> addUser(@RequestBody User user) {
		User user2 = userService.addUser(user);
		if (user2 != null) {
			return ResponseEntity.ok().body(user2);
		}
		return ResponseEntity.badRequest().build();
	}
	
	@PutMapping(value = "/user", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<User> updateUser(@RequestBody User user) {
		User user2 = userService.updateUser(user);
		if(user2 != null) {
			return ResponseEntity.ok().body(user2);
		}
		return ResponseEntity.notFound().build();
	}
	
	@DeleteMapping(value = "/user/{id}")
	public ResponseEntity<User> deleteUser(@PathVariable long id) {
		if (userService.deleteUser(id) != -1) {
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
}
