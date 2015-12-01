package com.bluemaple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.controller.Movie;
import com.bluemaple.dao.MovieDaoInterface;
import com.bluemaple.ticketbooking.Movies;

@Service
public class MovieServiceIntereaceImpl implements MovieServiceInterface{

	@Autowired
	MovieDaoInterface movieDaoInterface;
	
	@Override
	public List<Movies> addMovie(Movies movies) {
		// TODO Auto-generated method stub
		return movieDaoInterface.addMovie(movies);
	}

}
