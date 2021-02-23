package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
public class NameQueryMessageReqDto {

	private String name;

	public NameQueryMessageReqDto() {
	}
	
	public NameQueryMessageReqDto(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

	
}
