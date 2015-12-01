package com.bluemaple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.service.TimeServiceInterface;
import com.bluemaple.ticketbooking.MovieTime;

@Controller
public class Timings {
	
	@Autowired
	TimeServiceInterface timeServiceInterface;
	
	@RequestMapping(value = "/addtime", method = RequestMethod.GET)
	public ModelAndView addTime() {
		int idtime = 0;
		return new ModelAndView("timeadding","idtime",idtime);
	}
	
	@RequestMapping(value = "/timeaddin", method = RequestMethod.GET)
	public ModelAndView addTimings(@ModelAttribute MovieTime movieTime) {
		List<MovieTime> timeings = timeServiceInterface.addTimings(movieTime);
		return new ModelAndView("adminpage","timeings",timeings);
		
	}

	@RequestMapping(value = "/updatetime", method = RequestMethod.GET)
	public ModelAndView updateTime(@ModelAttribute MovieTime movieTime) {
		int idtime = movieTime.getTimngsId();
		System.out.println("controller timeId "+idtime);
		return new ModelAndView("timeadding","idtime",idtime);
		
	}
	

}
