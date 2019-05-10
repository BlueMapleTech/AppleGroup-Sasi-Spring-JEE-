package com.bluemaple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bluemaple.dao.TimeDaoInterface;
import com.bluemaple.ticketbooking.MovieTime;
@Service
public class TimeServiceImpl implements TimeServiceInterface {

	@Autowired
	TimeDaoInterface timeDaoInterface;
	
	@Override
	public MovieTime addTimings(MovieTime movieTime) {
		// TODO Auto-generated method stub
		return timeDaoInterface.addTimings(movieTime);
	}

}
