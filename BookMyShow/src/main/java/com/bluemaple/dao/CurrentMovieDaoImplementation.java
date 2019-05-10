package com.bluemaple.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CurrentMovieDaoImplementation implements CurrentMovieDaoInterface{

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void getCurrentMovie() {
		// TODO Auto-generated method stub
		
		String sql = "select movie_name from movie where release_date=?";
		jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
