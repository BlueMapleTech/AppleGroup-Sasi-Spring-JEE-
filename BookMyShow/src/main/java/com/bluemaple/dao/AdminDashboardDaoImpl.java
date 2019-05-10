package com.bluemaple.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
		
		String sql = "SELECT * FROM timings";
		 
		List<Object> customers = new ArrayList();
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map row : rows) {
			MovieTime customer = new MovieTime();
			customer.setTimngsId((Integer)row.get("timings_id"));
			customer.setTime((String)row.get("timings"));
			System.out.println("Timings in dao"+customer.toString());
			customers.add(customer);
		}
		return customers;
		

		/*String retriveData = "select * from timings";
		 List<Object> ll1 = getJdbcTemplate().query(retriveData,new BeanPropertyRowMapper(MovieTime.class));
		System.out.println("dao movie timing: " +ll1.toString());
		return ll1;*/
		
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
		
		String sql = "SELECT * FROM ticket_type";
		 
		List<Object> customers = new ArrayList();
		
		List<Map<String, Object>> rows = getJdbcTemplate().queryForList(sql);
		for (Map row : rows) {
			Ticket tickt = new Ticket();
			tickt.setTicketId((Integer)row.get("ticket_type_id"));
			tickt.setTicketType((String)row.get("ticket_type"));
			tickt.setTicketCount((Integer)row.get("ticket_type_count"));
			
			customers.add(tickt);
		}
		return customers;
		
		
		/*String retriveData = "select * from ticket_type";
		 List<Object> ll2 = getJdbcTemplate().query(retriveData,new BeanPropertyRowMapper(Ticket.class));
		System.out.println("dao movie list: " +ll2.toString());
		return ll2;
		*/
	}

	
}
