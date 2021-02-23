package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 30/11/2563.
 */
public class CRM_QueryCAforAllResultReqDto {
	private HeaderDto header;
	private CRM_QueryCAforAllMessageReqDto body;
	
	public HeaderDto getHeader() {
		return header;
	}
	
	public void setHeader(HeaderDto header) {
		this.header = header;
	}
	
	public CRM_QueryCAforAllMessageReqDto getBody() {
		return body;
	}
	
	public void setBody(CRM_QueryCAforAllMessageReqDto body) {
		this.body = body;
	}
	
	
}
