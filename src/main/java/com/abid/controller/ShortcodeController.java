package com.abid.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abid.service.ShortcodeService;


@RestController
@RequestMapping("/shortcode")
public class ShortcodeController {

	
	
	@Autowired
	private ShortcodeService shortcodeService;

	@RequestMapping(value = "/list", method = { RequestMethod.GET })
	public ResponseEntity<List> getUsers() {
		try {
			List result = shortcodeService.getClubsAll();
			return ResponseEntity.status(HttpStatus.OK).body(result);
		} catch (Exception e) {
			System.out.println("Exception e"+e);
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}

	}


}
