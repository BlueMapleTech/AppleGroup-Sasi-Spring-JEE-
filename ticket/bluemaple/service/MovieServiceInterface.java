package com.bluemaple.service;

import java.util.List;

import com.bluemaple.controller.Movie;
import com.bluemaple.ticketbooking.Movies;

public interface MovieServiceInterface {

	List<Movies> addMovie(Movies movies);

}
