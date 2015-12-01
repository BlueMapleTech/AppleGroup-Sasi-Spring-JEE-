package com.bluemaple.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.controller.Movie;
import com.bluemaple.ticketbooking.Movies;

@Repository
public class MovieDaoImpl implements MovieDaoInterface {

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Movies> addMovie(Movies movies) {
		// TODO Auto-generated method stub
		if(movies.getMovieId()==0){
		String movieQuery = "insert into movie(movie_name, release_date, no_of_shows)values(?,?,?) ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(movieQuery,
			new Object[] {movies.getMovieName(),movies.getReleaseDate(),movies.getNoOfShows()});
		}
		else{
			String movieUpdate = "update movie set movie_name=?,release_date=?,no_of_shows=? where movie_id=?";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(movieUpdate,
					new Object[] {movies.getMovieName(),movies.getReleaseDate(),movies.getNoOfShows(),movies.getMovieId() });
		}
		return null;
	}
		/*
		String retriveData = "select * from movie";
		 List<Movies> ll = getJdbcTemplate().query(retriveData,new BeanPropertyRowMapper(Movies.class));
		System.out.println("dao movie list: " +ll.toString());
		return ll;
	}*/

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
