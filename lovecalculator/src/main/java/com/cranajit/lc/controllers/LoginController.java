package com.cranajit.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cranajit.lc.dtos.LoginDTO;

@Controller
public class LoginController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getLoginPage(@ModelAttribute LoginDTO loginDto) {
		return "login";
	}
}
