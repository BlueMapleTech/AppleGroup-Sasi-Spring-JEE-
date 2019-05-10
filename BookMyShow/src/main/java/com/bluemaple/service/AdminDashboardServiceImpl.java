package com.bluemaple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.dao.AdminDashboardDao;
import com.bluemaple.ticketbooking.MovieTime;
import com.bluemaple.ticketbooking.Movies;
import com.bluemaple.ticketbooking.ReservationStatus;
import com.bluemaple.ticketbooking.Ticket;

@Service
public class AdminDashboardServiceImpl implements AdminDashboardService {

	@Autowired
	AdminDashboardDao adminDashboardDao;

	@Override
	public List<Object> movieList() {
		// TODO Auto-generated method stub
		return adminDashboardDao.movieList();
	}

	@Override
	public List<Object> timingList() {
		return adminDashboardDao.timingList();
	}

	@Override
	public List<Object> reservationStatusList() {
		// TODO Auto-generated method stub
		return adminDashboardDao.reservationStatusList();
	}

	@Override
	public List<Object> ticketTypeList() {
		// TODO Auto-generated method stub
		return adminDashboardDao.ticketTypeList();
	}
}
