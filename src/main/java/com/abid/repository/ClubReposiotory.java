package com.abid.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abid.model.Club;


@Repository
public class ClubReposiotory  {
	
	@Autowired
	@Qualifier("jdbcSubscription")
	private JdbcTemplate jdbcTemplate;

	public List<Club> findAll() {
		
		String sql  ="select * from club";
		 List<Club> clubs = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Club>(Club.class));
		return clubs;
	}
	
	
	
	
}
