package com.bluemaple.dao;

import java.util.List;

import com.bluemaple.ticketbooking.MovieTime;
import com.bluemaple.ticketbooking.Movies;
import com.bluemaple.ticketbooking.ReservationStatus;
import com.bluemaple.ticketbooking.Ticket;

public interface AdminDashboardDao {

	List<Object> movieList();

	List<Object> timingList();

	List<Object> reservationStatusList();

	List<Object> ticketTypeList();

}
