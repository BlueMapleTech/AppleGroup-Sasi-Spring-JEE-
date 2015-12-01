package com.bluemaple.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.dao.LoginDaoInterface;
import com.bluemaple.ticketbooking.UserRegister;

@Service
public class LoginServiceImpl implements LoginServiceInterface {

	@Autowired
	LoginDaoInterface loginDaoInterface;
	
	@Override
	public UserRegister loginForm(UserRegister userLogin) {
		// TODO Auto-generated method stub
		UserRegister userValues = loginDaoInterface.loginForm(userLogin);
		
		if (userValues.getUserName().equals(userLogin.getUserName())
				&& userValues.getPassWord().equals(userLogin.getPassWord()) && userValues.getRoleId()==1) {
			userLogin.setRoleId(1);
			
		} else if (userValues.getUserName().equals(userLogin.getUserName())
				&& userValues.getPassWord().equals(userLogin.getPassWord()) && userValues.getRoleId()==2) {
			userLogin.setRoleId(2);
			
		}
		else {
			userLogin.setRoleId(3);
		}
		return userLogin;
		
		//return result;
	}

	
}
