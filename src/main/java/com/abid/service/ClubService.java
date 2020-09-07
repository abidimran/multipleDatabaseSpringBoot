package com.abid.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abid.model.Club;
import com.abid.repository.ClubReposiotory;

@Service
public class ClubService {
	
	
	@Autowired
	private ClubReposiotory clubReposiotory;
	
	public List<Club> getClubsAll() {
			List<Club> result = clubReposiotory.findAll();
			return result;
	}
	
	
	
	

}
