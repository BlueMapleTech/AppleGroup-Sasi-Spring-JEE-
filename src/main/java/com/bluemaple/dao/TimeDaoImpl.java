package com.bluemaple.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.bluemaple.ticketbooking.MovieTime;

@Repository
public class TimeDaoImpl implements TimeDaoInterface {

	@Autowired
	DataSource dataSource;

	JdbcTemplate jdbcTemplate;

	@Override
	public MovieTime addTimings(MovieTime movieTime) {
		// TODO Auto-generated method stub

		if (movieTime.getTimngsId() == 0) {
			System.out.println("timing id" + movieTime.getTimngsId());
			String showtim = "insert into timings(timings)values(?)";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(showtim, new Object[] { movieTime.getTime() });
		}

		else {
			String timUpdate = "update timings set timings=? where timings_id=?";
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			jdbcTemplate.update(timUpdate, new Object[] { movieTime.getTime(), movieTime.getTimngsId() });
		}
		return movieTime;

		/*
		 * String sql = "select * from timings"; List<MovieTime> customer =
		 * (List<MovieTime>)((JdbcTemplate) getJdbcTemplate()).queryForObject(
		 * sql, new Object[] {movieTime.getTimngsId(),movieTime.getTime() }, new
		 * TimeData()); System.out.println("data" +customer.toString()); return
		 * customer;
		 */

		/*String retriveData = "select * from timings";
		//jdbcTemplate = new JdbcTemplate(dataSource);

		List<MovieTime> ll = getJdbcTemplate().query(retriveData,
				new BeanPropertyRowMapper(MovieTime.class));
		System.out.println(ll);*/
		

		/*
		 * String retriveData = "select * from timings"; List<MovieTime> actors
		 * = jdbcTemplate.query( retriveData, new Object[]
		 * {movieTime.getTimngsId(), movieTime.getTime()}, new
		 * RowMapper<MovieTime>() { public MovieTime mapRow(ResultSet rs, int
		 * rowNum) throws SQLException { MovieTime c = new MovieTime();
		 * c.setTimngsId(rs.getInt(1)); c.setTime(rs.getString(2));
		 * 
		 * return c; } }); return actors;
		 */

		/*
		 * String retriveData = "select * from timings";
		 * 
		 * @SuppressWarnings("unchecked") List<MovieTime> mt = (List<MovieTime>)
		 * jdbcTemplate.query("retriveData", new ResultSetExtractor<Object>() {
		 * 
		 * @Override public Object extractData(ResultSet rs) throws
		 * SQLException, DataAccessException { //do what ever you want to do
		 * with rs //List<MovieTime> mt = new ArrayList<MovieTime>(); MovieTime
		 * mtime = new MovieTime(); mtime.setTimngsId(rs.getInt(1));
		 * mtime.setTime(rs.getString(2)); //mt.add(mtime); return mtime; } });
		 * return mt;
		 */

	}

	private JdbcTemplate getJdbcTemplate() {
		// TODO Auto-generated method stub
		return jdbcTemplate = new JdbcTemplate(dataSource);
	}

}
