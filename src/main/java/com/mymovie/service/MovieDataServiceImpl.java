package com.mymovie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.dto.MovieName;
import com.mymovie.entity.Movie;
import com.mymovie.repository.MovieRepository;

@Service
public class MovieDataServiceImpl implements MovieDataService {

	@Autowired
	MovieRepository movieRepository;
	
	
	public List<MovieName> getMovieName() {
		List<Movie> movieDataEntity = movieRepository.findAll();
		List<MovieName> getMovieData = new ArrayList<MovieName>();
		for(int i =0;i<movieDataEntity.size();i++)
		{
			MovieName movieName = new MovieName();
			movieName.setMovieId(movieDataEntity.get(i).getMovieId());
			movieName.setMovieName(movieDataEntity.get(i).getMovieName());
			getMovieData.add(movieName);
		}
		return getMovieData;
	}
	
}
