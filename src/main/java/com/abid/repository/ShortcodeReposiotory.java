package com.abid.repository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.abid.model.Shortcode;


@Repository
public class ShortcodeReposiotory  {
	
	@Autowired
	@Qualifier("jdbcSmsgw")
	private JdbcTemplate jdbcTemplate;

	public List<Shortcode> findAll() {
		
		String sql  ="select * from shortcode";
		 List<Shortcode> sc = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Shortcode>(Shortcode.class));
		 
		return sc;
	}
	
	
	
	
	
	
}
