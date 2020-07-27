package com.cranajit.music.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

	@ResponseBody
	@RequestMapping(value = "/name")
	public String getName() {
		return "RANAJIT";
	}
}
