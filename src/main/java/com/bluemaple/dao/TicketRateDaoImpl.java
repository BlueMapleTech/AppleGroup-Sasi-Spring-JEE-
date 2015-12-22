package com.bluemaple.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.ticketbooking.Movies;

@Repository
public class TicketRateDaoImpl implements TicketRateDaoInterface {

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void ticketRat(Movies moves) {
		// TODO Auto-generated method stub
		
		
		String showtim = "insert into ticket_rate( ticket_rate, movie_id,ticket_type)values(?,?,?)";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(showtim, new Object[] { moves.getTicketRate(),moves.getMovieId(),moves.getTicketTypee() });
		
	}

}
