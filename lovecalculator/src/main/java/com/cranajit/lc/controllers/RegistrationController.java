package com.cranajit.lc.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cranajit.lc.dtos.RegistrationDTO;

@Controller
public class RegistrationController {

	@RequestMapping(value = "/success", method = RequestMethod.POST)
	public String handleRegistration(@Valid RegistrationDTO registrationDTO, BindingResult result, Model model) {
		if(result.hasErrors()) {
			List<ObjectError> errors = result.getAllErrors();
			for(ObjectError err: errors) {
				System.out.println(err);
			}
			
			return "registration";
		}
		return "successregistration";
	}
	
	@RequestMapping(value = "/registration", method = RequestMethod.GET)
	public String getRegistrationPage(@ModelAttribute RegistrationDTO registrationDTO) {
		return "registration";
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		System.out.println("Inside init binder");
		binder.setDisallowedFields("name");
	}
}
