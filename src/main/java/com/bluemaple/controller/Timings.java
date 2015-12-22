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
		int moviTimeId = 0;
		return new ModelAndView("timeadding","moviTimeId",moviTimeId);
	}
	
	@RequestMapping(value = "/timeaddin", method = RequestMethod.GET)
	public ModelAndView addTimings(@ModelAttribute MovieTime movieTime) {
		System.out.println("Controller Timing id"+movieTime.getTimngsId());
		MovieTime timeings = timeServiceInterface.addTimings(movieTime);
		return new ModelAndView("redirect:/listPage");
		
	}

	@RequestMapping(value = "/updatetime", method = RequestMethod.GET)
	public ModelAndView updateTime(@RequestParam("Id") int moviTimeId) {
		//System.out.println("controller timeId "+iddd);
		//int idtime = movieTime.getTimngsId();
		System.out.println("controller timeId "+moviTimeId);
		return new ModelAndView("timeadding","moviTimeId",moviTimeId);
		
	}
	

}
