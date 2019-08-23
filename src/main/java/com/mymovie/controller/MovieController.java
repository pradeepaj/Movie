package com.mymovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymovie.dto.MovieList;
import com.mymovie.dto.TheatreDto;
import com.mymovie.entity.Theatre;
import com.mymovie.service.TheatreService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class MovieController {
	
	@Autowired
	private TheatreService theatreService;
	
	/*@GetMapping("/getAllTheatres")
	public ResponseEntity<List<TheatreDto>> allTheatres(){
		return new ResponseEntity<List<TheatreDto>>(theatreService.getAllTheatres(),HttpStatus.OK);
	}*/
	
	@GetMapping("/getAllTheatres")
	public ResponseEntity<MovieList> allTheatre(){
		return new ResponseEntity<MovieList>(theatreService.getAllTheatres(),HttpStatus.OK);
	}

}
