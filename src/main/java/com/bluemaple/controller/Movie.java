package com.bluemaple.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

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
	public ModelAndView addMovie( HttpServletRequest req){
		
		Movies moves = new Movies();
		//List<Movies> listMovie = movieServiceInterface.addMovie(movies);
		//System.out.println("controller movielist:"+listMovie.toString());
		int moviId = Integer.parseInt(req.getParameter("movieId"));
		moves.setMovieId(moviId);
		String id[] =req.getParameterValues("timngsId");
		String namem = req.getParameter("movieName");
		moves.setMovieName(namem);
		String relDate = req.getParameter("releaseDate");
		moves.setReleaseDate(relDate);
		String noShows = req.getParameter("noOfShows");
		moves.setNoOfShows(noShows);
		Float rateMovie = Float.parseFloat(req.getParameter("ticketRate"));
		moves.setTicketRate(rateMovie);
		Float rateMovies = Float.parseFloat(req.getParameter("ticketRate1"));
		moves.setTicketRate1(rateMovies);
		
		 movieServiceInterface.addMovie(moves,id);
		 System.out.println("movieid"+moves.getMovieId());
		return new ModelAndView("redirect:/listPage");
		
	}
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView movieUpdate(@RequestParam("movieId") int moviId){
		int id = moviId;
		return new ModelAndView("movieadding","id",id);
		
	}
	
}
