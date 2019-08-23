package com.mymovie.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;

import com.mymovie.dto.DisplayTicketDto;
@Service
public interface DisplayTicketService {

DisplayTicketDto getTicketDetails(int ticketGenId);

// getTicDetails(int movieId, int theatreId);

}
