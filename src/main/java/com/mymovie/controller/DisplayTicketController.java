package com.mymovie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.mymovie.service.DisplayTicketService;
@RequestMapping("/api")
@RestController
@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
public class DisplayTicketController {
	@Autowired
	DisplayTicketService displayTicketService;
	@GetMapping("/getTicketDetail/{ticketGenId}")
public ResponseEntity displayTicketDetails(@PathVariable int ticketGenId) {
		return new ResponseEntity(displayTicketService.getTicketDetails(ticketGenId),HttpStatus.OK);
		
	}
	/*@GetMapping("/getTicketDetail/{movieId}/{theatreId"})
	public ResponseEntity getTicketDetails(@PathVariable int movieId,@PathVariable int theatreId) {
		
		return new ResponseEntity(displayTicketService.getTicDetails(movieId,theatreId),HttpStatus.OK);
		
	}*/
	
	
}
