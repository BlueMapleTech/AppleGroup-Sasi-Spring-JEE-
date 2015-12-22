package com.bluemaple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.controller.Movie;
import com.bluemaple.dao.MovieDaoInterface;
import com.bluemaple.dao.TicketRateDaoInterface;
import com.bluemaple.ticketbooking.Movies;

@Service
public class MovieServiceIntereaceImpl implements MovieServiceInterface{

	@Autowired
	MovieDaoInterface movieDaoInterface;
	
	@Autowired
	TicketRateDaoInterface ticketRateDaoInterface;
	
	
	@Override
	public void addMovie(Movies moves, String[] id) {
		// TODO Auto-generated method stub
		 movieDaoInterface.addMovie(moves);
		String nam = moves.getMovieName();
		Movies movId = movieDaoInterface.getMovieId(nam);
		int movid = movId.getMovieId();
		System.out.println("movieid"+movid);
		for(int i = 0;i<id.length;i++){
			String a = id[i];
			movieDaoInterface.addTimng(movid,a);
			
		}
		
		Float trate = moves.getTicketRate();
		Float trate1 = moves.getTicketRate1();
		
		moves.setMovieId(movid);
		moves.setTicketRate(trate);
		moves.setTicketTypee(1);
		ticketRateDaoInterface.ticketRat(moves);
		
		moves.setMovieId(movid);
		moves.setTicketRate(trate1);
		moves.setTicketTypee(2);
		ticketRateDaoInterface.ticketRat(moves);
	}

}
