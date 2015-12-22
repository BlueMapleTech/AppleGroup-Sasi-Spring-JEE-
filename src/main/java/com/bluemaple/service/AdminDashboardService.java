package com.bluemaple.service;

import java.util.List;

import com.bluemaple.ticketbooking.MovieTime;
import com.bluemaple.ticketbooking.Movies;
import com.bluemaple.ticketbooking.ReservationStatus;
import com.bluemaple.ticketbooking.Ticket;

public interface AdminDashboardService {

	List<Object> movieList();

	List<Object> timingList();

	List<Object> reservationStatusList();

	List<Object> ticketTypeList();

}
