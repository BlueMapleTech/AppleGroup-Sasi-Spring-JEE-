package com.bluemaple.dao;

import java.util.List;

import com.bluemaple.controller.Movie;
import com.bluemaple.ticketbooking.Movies;

public interface MovieDaoInterface {

	void addMovie(Movies moves);

	Movies getMovieId(String nam);

	void addTimng(int movid, String a);

	

	

}
