package com.bluemaple.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemaple.ticketbooking.MovieTime;

public class MovieTimeData implements RowMapper {

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		MovieTime mt = new MovieTime();
		mt.setTimngsId(rs.getInt("timings_id"));
		mt.setTime(rs.getString("timings"));
		
		return mt;
	}

}
