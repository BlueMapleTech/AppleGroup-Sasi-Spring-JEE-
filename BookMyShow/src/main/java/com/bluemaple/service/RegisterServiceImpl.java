package com.bluemaple.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.bluemaple.dao.RegisterDaoInterface;
import com.bluemaple.ticketbooking.UserRegister;

public class RegisterServiceImpl implements RegisterInterface {

	@Autowired
	RegisterDaoInterface registerDaoInterface;
	
	@Override
	public void registerForm(UserRegister userRegister) {
		// TODO Auto-generated method stub
		registerDaoInterface.registerForm(userRegister);
	}

}
