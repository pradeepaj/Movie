package com.mymovie.dto;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDto {
	private String movieName;
	private String theatreName;
	private Date bookedDate;
	private String showsName;
	private int noOfSeats;
}
