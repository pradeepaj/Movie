package com.mymovie.service;

import java.util.List;

import com.mymovie.dto.MovieList;
import com.mymovie.dto.TheatreDto;
import com.mymovie.entity.Theatre;

public interface TheatreService {
	
	//List<TheatreDto> getAllTheatres();
	
	MovieList getAllTheatres();

}
