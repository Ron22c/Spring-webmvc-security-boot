package com.chandras.fwb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {
	
	@ResponseBody
	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public String getWelcomeMessage() {
		return "WELCOME TO THE WEBSERVICE";
	}

}
