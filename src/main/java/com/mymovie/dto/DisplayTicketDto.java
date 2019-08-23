package com.mymovie.dto;



import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisplayTicketDto {
	List<DataDto> data;
private String status;
private Integer statusCode;
private String message;

}
