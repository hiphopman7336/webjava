package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
public class ServiceIdQueryMessageReqDto {

	private String serviceId;
	
	public ServiceIdQueryMessageReqDto() {
		
	}
	
	public ServiceIdQueryMessageReqDto(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
}
