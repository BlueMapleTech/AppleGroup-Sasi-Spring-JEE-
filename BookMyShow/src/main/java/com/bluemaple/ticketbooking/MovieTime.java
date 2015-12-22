package com.bluemaple.ticketbooking;

public class MovieTime {
	private int timngsId;
	private String time;
	
	public int getTimngsId() {
		return timngsId;
	}
	public void setTimngsId(int timngsId) {
		this.timngsId = timngsId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "MovieTime [timngsId=" + timngsId + ", time=" + time + "]";
	}
	
	

}
