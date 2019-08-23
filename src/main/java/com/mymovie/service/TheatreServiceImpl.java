package com.mymovie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.entity.Theatre;
import com.mymovie.repository.TheatreRepository;

@Service
public class TheatreServiceImpl implements TheatreService {

	@Autowired
	private TheatreRepository theatreRepository;
	
	@Override
	public List<Theatre> allTheatre() {
		
		return theatreRepository.findAll();
	}

}
