package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
public class BaIdQueryMessageReqDto {

	private String baId;

	public BaIdQueryMessageReqDto() {

	}

	public BaIdQueryMessageReqDto(String baId) {
		this.baId = baId;
	}

	public String getBaId() {
		return baId;
	}

	public void setBaId(String baId) {
		this.baId = baId;
	}

}
