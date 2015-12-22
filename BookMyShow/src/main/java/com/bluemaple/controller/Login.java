package com.bluemaple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.service.LoginServiceInterface;
import com.bluemaple.ticketbooking.UserRegister;



@Controller
public class Login {
	
	@Autowired
	LoginServiceInterface loginServiceInterface;

	@RequestMapping(value = "/luser", method = RequestMethod.POST)
	public ModelAndView loginForm(@ModelAttribute UserRegister userLogin){
		UserRegister res = loginServiceInterface.loginForm(userLogin);
		if(res.getRoleId()==1){
			int iddd = res.getRoleId();
			return new ModelAndView("userpage","iddd",iddd);
		}
	
		else if(res.getRoleId()==2){
			return new ModelAndView("redirect:/listPage");
		}
		else{
			return new ModelAndView("login");
		}
	}

}
