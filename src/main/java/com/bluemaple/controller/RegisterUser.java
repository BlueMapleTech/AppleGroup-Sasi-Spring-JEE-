package com.bluemaple.controller;

import javax.xml.ws.RequestWrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.service.RegisterInterface;
import com.bluemaple.ticketbooking.UserRegister;

public class RegisterUser {
	
	@Autowired
	RegisterInterface registerInterface;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ModelAndView registerForm(@ModelAttribute UserRegister userRegister){
		registerInterface.registerForm(userRegister);
		return new ModelAndView();
		
	}
	
	@RequestMapping(value = "/register1", method = RequestMethod.POST)
	public ModelAndView register(){
		//registerInterface.registerForm();
		return new ModelAndView("userregisterform");
		
	}
}
