package com.bluemaple.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemaple.ticketbooking.UserRegister;

public class LoginData implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		
		UserRegister usdetail = new UserRegister();
		usdetail.setUserName(rs.getString("username"));
		usdetail.setPassWord(rs.getString("password"));
		usdetail.setRoleId(rs.getInt("user_role"));
		System.out.println("rowmapr"  + rs.getInt("user_role"));
		return usdetail;
		
	}

}
