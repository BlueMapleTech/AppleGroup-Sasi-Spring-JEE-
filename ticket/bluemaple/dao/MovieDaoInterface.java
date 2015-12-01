package com.bluemaple.dao;

import java.util.List;

import com.bluemaple.controller.Movie;
import com.bluemaple.ticketbooking.Movies;

public interface MovieDaoInterface {

	List<Movies> addMovie(Movies movies);

}
