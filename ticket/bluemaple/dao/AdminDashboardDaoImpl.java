package com.bluemaple.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.ticketbooking.MovieTime;
import com.bluemaple.ticketbooking.Movies;
import com.bluemaple.ticketbooking.ReservationStatus;
import com.bluemaple.ticketbooking.Ticket;

@Repository
public class AdminDashboardDaoImpl implements AdminDashboardDao{

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Object> movieList() {
		// TODO Auto-generated method stub
		
		String retriveData = "select * from movie";
		 List<Object> ll = getJdbcTemplate().query(retriveData,new BeanPropertyRowMapper(Movies.class));
		System.out.println("dao movie list: " +ll.toString());
		return ll;
	}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate  = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Object> timingList() {
		// TODO Auto-generated method stub
		

		String retriveData = "select * from timings";
		 List<Object> ll = getJdbcTemplate().query(retriveData,new BeanPropertyRowMapper(MovieTime.class));
		System.out.println("dao movie list: " +ll.toString());
		return ll;
		
	}

	@Override
	public List<Object> reservationStatusList() {
		// TODO Auto-generated method stub
		String retriveData = "select * from timings";
		 List<Object> ll = getJdbcTemplate().query(retriveData,new BeanPropertyRowMapper(ReservationStatus.class));
		System.out.println("dao movie list: " +ll.toString());
		return ll;
	}

	@Override
	public List<Object> ticketTypeList() {
		// TODO Auto-generated method stub
		
		String retriveData = "select * from ticket_type";
		 List<Object> ll = getJdbcTemplate().query(retriveData,new BeanPropertyRowMapper(Ticket.class));
		System.out.println("dao movie list: " +ll.toString());
		return ll;
		
	}

	
}
