package com.mymovie.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MovieList {
	
	private String message;
	private String statusCode;
	private String status;
	private List<TheatreDto> data;

}
