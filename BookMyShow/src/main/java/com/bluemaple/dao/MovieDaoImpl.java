package com.bluemaple.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bluemaple.controller.Movie;
import com.bluemaple.ticketbooking.Movies;
import com.bluemaple.ticketbooking.UserRegister;

@Repository
public class MovieDaoImpl implements MovieDaoInterface {

	@Autowired
	DataSource dataSource;
	
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void addMovie(Movies moves) {
		// TODO Auto-generated method stub
		if(moves.getMovieId()==0){
		String movieQuery = "insert into movie(movie_name, release_date, no_of_shows)values(?,?,?) ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(movieQuery,
			new Object[] {moves.getMovieName(),moves.getReleaseDate(),moves.getNoOfShows()});
		}
		else{
			String movieUpdate = "update movie set movie_name=?,release_date=?,no_of_shows=? where movie_id=?";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(movieUpdate,
					new Object[] {moves.getMovieName(),moves.getReleaseDate(),moves.getNoOfShows(),moves.getMovieId() });
		}
		
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

	@Override
	public Movies getMovieId(String nam) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM movie WHERE movie_name= ?";
		//System.out.println("daoImpl" +n);
		jdbcTemplate = new JdbcTemplate(dataSource);
		Movies moviesss = (Movies)((JdbcTemplate) getJdbcTemplate()).queryForObject(
				sql, new Object[] { nam}, new MovieID("nam"));
			//System.out.println("data" +customer.toString());
		return moviesss;
		
	}

	@Override
	public void addTimng(int movid, String a) {
		// TODO Auto-generated method stub
		String movieQuery = "insert into movies_list_has_timings(movie_id, timings_id)values(?,?) ";
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		jdbcTemplate.update(movieQuery,
			new Object[] {movid,a});
		
		
	}

		
	
}
