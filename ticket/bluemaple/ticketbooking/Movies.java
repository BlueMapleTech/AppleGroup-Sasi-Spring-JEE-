package com.bluemaple.ticketbooking;

public class Movies {
	
	private int movieId;
	private String movieName;
	private String releaseDate;
	private String noOfShows;
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
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
				+ ", noOfShows=" + noOfShows + "]";
	}
	
	

}
