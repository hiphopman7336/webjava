package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@Root(name="return",strict=false)
public class ServiceIdQueryResult {

	@Element(name="baId", required=false)
	private String baId;

	@Element(name="billingName", required=false)
	private String billingName;

	@Element(name="billingAddress", required=false)
	private String billingAddress;

	@Element(name="response_date", required=false)
	private String response_date;

	@Element(name="installlationAddress", required=false)
	private String installlationAddress;

	@Element(name="serviceId", required=false)
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
