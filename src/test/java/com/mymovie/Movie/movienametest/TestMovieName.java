package com.mymovie.Movie.movienametest;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.mymovie.dto.MovieList;
import com.mymovie.dto.MovieName;
import com.mymovie.dto.TheatreDto;
import com.mymovie.dto.TheatreList;
import com.mymovie.entity.Movie;
import com.mymovie.repository.MovieRepository;
import com.mymovie.service.MovieDataService;
import com.mymovie.service.MovieDataServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class TestMovieName {
	
	@Mock
	MovieRepository movieRepository;
	
	@InjectMocks
	MovieDataServiceImpl movieData;
	
	
	public MovieName getMovie()
	{
		MovieName movieName = new MovieName();
		movieName.setMovieId(1);
		movieName.setMovieName("Kurukshetra");
		return movieName;
	}
	
	public MovieName getMovie1()
	{
		MovieName movieName = new MovieName();
		movieName.setMovieId(2);
		movieName.setMovieName("Pailwan");
		return movieName;
	}
	
		
	public Movie getMovie3()
	{
		Movie movieName = new Movie();
		movieName.setMovieId(2);
		movieName.setMovieName("Pailwan");
		return movieName;
	}
	
	public Movie getMovie4()
	{
		Movie movieName = new Movie();
		movieName.setMovieId(2);
		movieName.setMovieName("Pailwan");
		return movieName;
	}
	
	@Test
	public void getMovieList()
	{
		List<Movie> movieName = new ArrayList<Movie>();
		movieName.add(getMovie3());
		movieName.add(getMovie4());
		
		List<MovieName> moviNameList = new ArrayList<MovieName>();
		moviNameList.add(getMovie());
		moviNameList.add(getMovie1());
		
		TheatreList theatreList = new TheatreList();
		theatreList.setData(moviNameList);
		theatreList.setMessage("got the list");
		theatreList.setStatus("SUCCESS");
		theatreList.setStatusCode("200");
		
		Mockito.when(movieRepository.findAll()).thenReturn(movieName);
		TheatreList addlist =  movieData.getMovieName();
		Assert.assertEquals(addlist.getMessage(), theatreList.getMessage());
	}

}
