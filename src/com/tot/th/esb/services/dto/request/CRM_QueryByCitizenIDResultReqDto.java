package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 2/12/2563.
 */	
public class CRM_QueryByCitizenIDResultReqDto {
	
	private HeaderDto header;
	private CRM_QueryByCitizenIDMessageReqDto body;
	
	public HeaderDto getHeader() {
		return header;
	}
	
	public void setHeader(HeaderDto header) {
		this.header = header;
	}
	
	public CRM_QueryByCitizenIDMessageReqDto getBody() {
		return body;
	}
	
	public void setBody(CRM_QueryByCitizenIDMessageReqDto body) {
		this.body = body;
	}
	
	
}
