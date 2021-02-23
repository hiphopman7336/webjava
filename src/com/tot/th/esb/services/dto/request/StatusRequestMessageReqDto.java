package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
public class StatusRequestMessageReqDto {

	private String request_id;

	public StatusRequestMessageReqDto(){
		
	}
	
	public StatusRequestMessageReqDto(String request_id) {
		this.request_id = request_id;
	}

	public String getRequest_id() {
		return request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}
	
	
}
