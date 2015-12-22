package com.bluemaple.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.ticketbooking.UserRegister;

@Repository
public class LoginDaoImpl implements LoginDaoInterface{

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	
	@Override
	public UserRegister loginForm(UserRegister userLogin) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM user WHERE username= ?";
		//System.out.println("daoImpl" +n);
		jdbcTemplate = new JdbcTemplate(dataSource);
		UserRegister customer = (UserRegister)((JdbcTemplate) getJdbcTemplate()).queryForObject(
				sql, new Object[] { userLogin.getUserName() }, new LoginData());
			System.out.println("data" +customer.toString());
		return customer;
	}

	private Object getJdbcTemplate() {
		// TODO Auto-generated method stub
		return  jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
