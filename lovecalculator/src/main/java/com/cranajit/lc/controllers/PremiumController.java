package com.cranajit.lc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cranajit.lc.dtos.PremiumRegistrationDTO;

@Controller
public class PremiumController {

	@RequestMapping(value = "/premium", method = RequestMethod.GET)
	public String getPremiumRegistration(@ModelAttribute PremiumRegistrationDTO premiumRegistrationDTO) {
		return "premium";
	}
	
	@RequestMapping(value = "/premiumregister", method = RequestMethod.POST)
	public String register(@ModelAttribute PremiumRegistrationDTO premiumRegistrationDTO) {
		return "successregistration";
	}
}
