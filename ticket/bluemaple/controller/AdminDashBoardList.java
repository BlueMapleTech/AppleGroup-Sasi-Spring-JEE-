package com.bluemaple.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.service.AdminDashboardService;
import com.bluemaple.ticketbooking.MovieTime;
import com.bluemaple.ticketbooking.Movies;
import com.bluemaple.ticketbooking.ReservationStatus;
import com.bluemaple.ticketbooking.Ticket;
import com.bluemaple.ticketbooking.UserRegister;

@Controller
public class AdminDashBoardList<K, V> {

	@Autowired
	AdminDashboardService adminDashboardService;
	
	@RequestMapping(value = "/listPage", method = RequestMethod.GET)
	public ModelAndView listOfDashBoard(){
		
		List<Object> moviesList = adminDashboardService.movieList();
		
		List<Object> movieTimeList = adminDashboardService.timingList();
		
		List<Object> reservationStatusList = adminDashboardService.reservationStatusList();
		
		List<Object> ticketTypeList = adminDashboardService.ticketTypeList();
		
		Map mapData =  new HashMap();
		mapData.put( "moviesListData", moviesList);
		mapData.put( "movieTimeListData", movieTimeList);
		mapData.put( "reservationStatusListData", reservationStatusList);
		mapData.put( "ticketTypeListData", ticketTypeList);
		
		List<Map> lmap = new ArrayList<Map>();
		lmap.add(mapData);
		Map<String, Object> mapobj = new HashMap<String, Object>();
		mapobj.put("lmap", lmap);
		//String ur = "http://localhost:8081/controller/loginuser";
		return new ModelAndView("adminpage","mapobj",mapobj);
	}
	
}
