package com.bluemaple.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.ticketbooking.Ticket;

@Repository
public class TicketTypeDaoImpl implements TicketTypeDaoInterface{

	@Autowired
	DataSource  dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Ticket> addTicket(Ticket ticket) {
		// TODO Auto-generated method stub
		System.out.println("DaoTicket"+ticket.toString());
		if(ticket.getTicketId()==0 ){
		String movieQuery = "insert into ticket_type(ticket_type, ticket_type_count)values(?,?) ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(movieQuery,
			new Object[] {ticket.getTicketType(),ticket.getTicketCount()});
		}
		else{
			String movieUpdate = "update ticket_type set ticket_type=?,ticket_type_count=? where ticket_type_id=?";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(movieUpdate,
					new Object[] {ticket.getTicketType(),ticket.getTicketCount(),ticket.getTicketId() });
		}
		

		String retriveTicket = "select * from ticket_type";
		 List<Ticket> ll = getJdbcTemplate().query(retriveTicket,new BeanPropertyRowMapper(Ticket.class));
		System.out.println("DaoTicket list: " +ll.toString());
		return ll;
	}
		

	private org.springframework.jdbc.core.JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate = new JdbcTemplate(dataSource);
	}


	
	}


