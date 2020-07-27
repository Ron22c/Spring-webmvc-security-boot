package com.cranajit.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cranajit.lc.dtos.LoginDTO;
import com.cranajit.lc.models.UserModel;

@Controller
public class HomeController {
	
	@RequestMapping(value = "/home", method = {RequestMethod.GET, RequestMethod.POST})
	public String getHomePage(@Valid @ModelAttribute LoginDTO loginDto, BindingResult result, Model model) {
		if (result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError err: errors) {
				System.out.println(err);
			}
			
			return "login";
		}
		model.addAttribute("info", loginDto);
		return "calculate";
	}
	
	@RequestMapping(value = "/relation")
	public String getMatchResult(LoginDTO logininfo, Model model) {
		return "result";
	}
	

	@ResponseBody
	@RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET,
					produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> getUser(@PathVariable("id") int id) {
		System.out.println("id: "+id);
		return ResponseEntity.ok().body(new UserModel("hi", "hello"));
	}
}
