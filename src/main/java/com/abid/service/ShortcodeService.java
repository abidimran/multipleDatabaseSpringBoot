package com.abid.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abid.model.Shortcode;
import com.abid.repository.ShortcodeReposiotory;

@Service
public class ShortcodeService {
	
	
	@Autowired
	private ShortcodeReposiotory shortcodeReposiotory;
	
	public List<Shortcode> getClubsAll() {
			List<Shortcode> result = shortcodeReposiotory.findAll();
			return result;
	}
	
	
	
	

}
