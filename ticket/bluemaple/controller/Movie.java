package com.bluemaple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bluemaple.service.MovieServiceInterface;
import com.bluemaple.ticketbooking.Movies;
import com.bluemaple.ticketbooking.UserRegister;

@Controller
public class Movie {

	@Autowired
	MovieServiceInterface movieServiceInterface;
	
	@RequestMapping(value = "/movieadd", method = RequestMethod.GET)
	public ModelAndView moviepageredirect(){
		int id=0;
		return new ModelAndView("movieadding","id",id);
		
	}
	
	
	@RequestMapping(value = "/addmovi", method = RequestMethod.GET)
	public ModelAndView addMovie(@ModelAttribute Movies movies){
		List<Movies> listMovie = movieServiceInterface.addMovie(movies);
		System.out.println("controller movielist:"+listMovie.toString());
		return new ModelAndView("redirect:/listPage");
		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView movieUpdate(@RequestParam("movieId") int moviId){
		int id = moviId;
		return new ModelAndView("movieadding","id",id);
		
	}
	
}
