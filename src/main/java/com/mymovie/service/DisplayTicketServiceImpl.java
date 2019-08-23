package com.mymovie.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mymovie.dto.DataDto;
import com.mymovie.dto.DisplayTicketDto;
import com.mymovie.entity.Movie;
import com.mymovie.entity.Shows;
import com.mymovie.entity.Theatre;
import com.mymovie.entity.TheatreMovie;
import com.mymovie.entity.Ticket;
import com.mymovie.repository.MovieRepository;
import com.mymovie.repository.ShowsRepository;
import com.mymovie.repository.TheatreMovieRepository;
import com.mymovie.repository.TheatreRepository;
import com.mymovie.repository.TicketRepository;
@Service
public class DisplayTicketServiceImpl  implements DisplayTicketService{

	
	@Autowired
	MovieRepository movieRepository;
	@Autowired
	TheatreMovieRepository theatremovieRepository;
	@Autowired
	TicketRepository ticketRepository;
	@Autowired
	TheatreRepository theatreRepository;
	@Autowired
	ShowsRepository showsRepository;
	@Override
	public  DisplayTicketDto getTicketDetails(int ticketGenId) {
	List<Ticket> ticket=ticketRepository.findByTicketGenId(ticketGenId);
int thm=0,count=0;
Date date=new Date();
for(Ticket tickets:ticket)
{

 date=tickets.getBookedDate();
		thm=tickets.getTheatreMovieId();
		count++;
	
}
if(thm!=0) {
	
		TheatreMovie th=theatremovieRepository.findByTheatreMovieId(thm);
	int mveId=th.getMovieId();
	int theatreId=th.getTheatreId();
System.out.println(mveId);
System.out.println(theatreId);
Shows shows=showsRepository.findByTheatreMovieId(thm);
String showsName=shows.getShowsName();
	Movie movie=movieRepository.findByMovieId(mveId);
	String movieName=movie.getMovieName();
		Theatre theatre=theatreRepository.findByTheatreId(theatreId);
		String theatreName=theatre.getTheatreName();
		System.out.println(theatreName);
		System.out.println(movieName);
		List<DataDto> dto2=new ArrayList<DataDto>();
		DataDto dto1=new DataDto();
		
		dto1.setBookedDate(date);
		dto1.setMovieName(movieName);
		dto1.setNoOfSeats(count);
		dto1.setShowsName(showsName);
		dto1.setTheatreName(theatreName);
		dto2.add(dto1);
		DisplayTicketDto dto=new DisplayTicketDto();
		dto.setMessage("ok");
		dto.setStatus("SUCCESS");
		dto.setStatusCode(200);
dto.setData(dto2);
return dto;
	}
	
	else {
		DisplayTicketDto dto=new DisplayTicketDto();
	dto.setMessage("Entered ticket number is invalid, please re-enter.");
	dto.setStatus("FAILURE");
	dto.setStatusCode(200);
	return dto;
	}
}
}/*		@Override
public DisplayTicketDto getTicDetails(int movieId, int theatreId) {
	if(movieId==0)
	{
		TheatreMovie theatreMovie=theatremovieRepository.findByTheatreId(theatreId);
		
		
	}
	else
	{
	
		return null;
	}}*/
