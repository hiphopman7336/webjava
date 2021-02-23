package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@XmlRootElement
public class ServiceIdQueryMessageDto {
	
	private String baId;
	private String billingName;
	private String billingAddress;
	private String response_date;
	private String installlationAddress;
	private String serviceId;
	
	public String getBaId() {
		return baId;
	}
	
	public void setBaId(String baId) {
		this.baId = baId;
	}
	
	public String getBillingName() {
		return billingName;
	}
	
	public void setBillingName(String billingName) {
		this.billingName = billingName;
	}
	
	public String getBillingAddress() {
		return billingAddress;
	}
	
	public void setBillingAddress(String billingAddress) {
		this.billingAddress = billingAddress;
	}
	
	public String getResponse_date() {
		return response_date;
	}
	
	public void setResponse_date(String response_date) {
		this.response_date = response_date;
	}
	
	public String getInstalllationAddress() {
		return installlationAddress;
	}
	
	public void setInstalllationAddress(String installlationAddress) {
		this.installlationAddress = installlationAddress;
	}

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	

	
}


