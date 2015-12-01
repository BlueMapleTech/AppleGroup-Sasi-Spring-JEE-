package com.bluemaple.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemaple.ticketbooking.MovieTime;

public class TimeData implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		MovieTime getAll = new MovieTime();
		while(rs.next()){
		getAll.setTimngsId(rs.getInt("timings_id"));
		getAll.setTime(rs.getString("timings"));
		}
		System.out.println("values "+getAll.toString());
		return getAll;
	}

}
