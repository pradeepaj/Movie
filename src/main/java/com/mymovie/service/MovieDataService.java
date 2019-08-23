package com.mymovie.service;


import org.springframework.stereotype.Service;

import com.mymovie.dto.TheatreList;

@Service
public interface MovieDataService {
	
	
	TheatreList getMovieName();

}
