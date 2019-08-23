package com.mymovie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.dto.MovieList;
import com.mymovie.dto.TheatreDto;
import com.mymovie.entity.Theatre;
import com.mymovie.repository.TheatreRepository;

@Service
public class TheatreServiceImpl implements TheatreService {

	@Autowired
	private TheatreRepository theatreRepository;
	
	/*public List<TheatreDto> getAllTheatres()
	{
		List<Theatre> getTheatres = theatreRepository.findAll();
		List<TheatreDto> getTheatreDto = new ArrayList<TheatreDto>();
		for(int i= 0;i<getTheatres.size();i++)
		{
			TheatreDto theatreDto = new TheatreDto();
			theatreDto.setTheatreId(getTheatres.get(i).getTheatreId());
			theatreDto.setTheatreName(getTheatres.get(i).getTheatreName());
			getTheatreDto.add(theatreDto);
		}
		return getTheatreDto;
	}*/
	
	
	public MovieList getAllTheatres()
	{
		List<Theatre> getTheatres = theatreRepository.findAll();
		List<TheatreDto> getTheatreDto = new ArrayList<TheatreDto>();
		MovieList movieList = new MovieList();
		for(int i= 0;i<getTheatres.size();i++)
		{
			TheatreDto theatreDto = new TheatreDto();
			theatreDto.setTheatreId(getTheatres.get(i).getTheatreId());
			theatreDto.setTheatreName(getTheatres.get(i).getTheatreName());
			getTheatreDto.add(theatreDto);
		}
		movieList.setData(getTheatreDto);
		movieList.setMessage("got the list");
		movieList.setStatus("SUCCESS");
		movieList.setStatusCode("200");
		return movieList;
	}

}
