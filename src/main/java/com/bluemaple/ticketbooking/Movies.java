package com.bluemaple.ticketbooking;

public class Movies {
	
	private int movieId;
	private String movieName;
	private String releaseDate;
	private String noOfShows;
	private String timngsId;
	private float ticketRate;
	private float ticketRate1;
	private int ticketTypee;
	
	
	
	
	public int getTicketTypee() {
		return ticketTypee;
	}
	public void setTicketTypee(int ticketTypee) {
		this.ticketTypee = ticketTypee;
	}
	public float getTicketRate1() {
		return ticketRate1;
	}
	public void setTicketRate1(float ticketRate1) {
		this.ticketRate1 = ticketRate1;
	}
	public float getTicketRate() {
		return ticketRate;
	}
	public void setTicketRate(float ticketRate) {
		this.ticketRate = ticketRate;
	}
	public String getTimngsId() {
		return timngsId;
	}
	public void setTimngsId(String timngsId) {
		this.timngsId = timngsId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int string) {
		this.movieId = string;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}
	public String getNoOfShows() {
		return noOfShows;
	}
	public void setNoOfShows(String noOfShows) {
		this.noOfShows = noOfShows;
	}
	@Override
	public String toString() {
		return "Movies [movieId=" + movieId + ", movieName=" + movieName + ", releaseDate=" + releaseDate
				+ ", noOfShows=" + noOfShows + ", timngsId=" + timngsId + ", ticketRate=" + ticketRate
				+ ", ticketRate1=" + ticketRate1 + ", ticketTypee=" + ticketTypee + "]";
	}
	
	
	
}
