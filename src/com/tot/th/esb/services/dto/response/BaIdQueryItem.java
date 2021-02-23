package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@XmlRootElement
public class BaIdQueryItem {

	private String serviceId;
	private String startDate;
	private String EndDate;
	
	public String getServiceId() {
		return serviceId;
	}
	
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	
	public String getStartDate() {
		return startDate;
	}
	
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String getEndDate() {
		return EndDate;
	}
	
	public void setEndDate(String endDate) {
		EndDate = endDate;
	}
	
}
