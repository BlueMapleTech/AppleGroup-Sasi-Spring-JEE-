package com.bluemaple.dao;

import java.util.List;

import com.bluemaple.ticketbooking.MovieTime;

public interface TimeDaoInterface {

	List<MovieTime> addTimings(MovieTime movieTime);

}
