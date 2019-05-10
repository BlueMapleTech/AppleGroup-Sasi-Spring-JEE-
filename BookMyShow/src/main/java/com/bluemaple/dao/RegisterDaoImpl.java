package com.bluemaple.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.bluemaple.ticketbooking.UserRegister;

public class RegisterDaoImpl implements RegisterDaoInterface {

	@Autowired
    DataSource dataSource;
	
	@Override
	public void registerForm(UserRegister userRegister) {
		// TODO Auto-generated method stub
		
		String sql = "INSERT INTO user(username, password, first_name, last_name, email_address, address,created_date,updated_date,user_role) VALUES (?,?,?,?,?,?,?,?,?)";

		//System.out.println(user.toString());
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(sql,
				new Object[] {userRegister.getUserName(),userRegister.getPassWord(),userRegister.getFirstName(),userRegister.getLastName(),userRegister.geteMail(),userRegister.getAddress(),userRegister.getCreatedDate(),userRegister.getUpdatedDate(),userRegister.getRoleId() });

	}

}
