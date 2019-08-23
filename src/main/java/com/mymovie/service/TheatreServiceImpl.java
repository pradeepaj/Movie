package com.mymovie.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.dto.TheatreDto;
import com.mymovie.entity.Theatre;
import com.mymovie.repository.TheatreRepository;

@Service
public class TheatreServiceImpl implements TheatreService {

	@Autowired
	private TheatreRepository theatreRepository;
	
	public List<TheatreDto> getAllTheatres()
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
	}

}
