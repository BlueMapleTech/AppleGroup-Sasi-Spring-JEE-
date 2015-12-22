package com.bluemaple.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.bluemaple.ticketbooking.Movies;

public class MovieID implements RowMapper {

	public MovieID(String string) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Object mapRow(ResultSet rs, int arg1) throws SQLException {
		// TODO Auto-generated method stub
		Movies mm = new Movies();
		mm.setMovieId(rs.getInt("movie_id"));
		System.out.println(mm.toString());
		return mm;
	}

}
