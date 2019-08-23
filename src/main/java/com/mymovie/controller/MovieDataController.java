package com.mymovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mymovie.dto.MovieName;
import com.mymovie.service.MovieDataService;

@RestController
@RequestMapping("/api")
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class MovieDataController {
	
	@Autowired
	MovieDataService movieDataService;

	@GetMapping("/getAllMovies")
	public ResponseEntity<List<MovieName>> getMovieList()
	{
		return new ResponseEntity<List<MovieName>>(movieDataService.getMovieName(),HttpStatus.OK);
	}
}
