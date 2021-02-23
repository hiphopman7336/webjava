package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@XmlRootElement
public class NameQueryItem {
	private String baId;
	private String customerName;
	private String personalId;
	private String vatRegistrationCode;
	
	public String getBaId() {
		return baId;
	}
	public void setBaId(String baId) {
		this.baId = baId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getPersonalId() {
		return personalId;
	}
	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}
	public String getVatRegistrationCode() {
		return vatRegistrationCode;
	}
	public void setVatRegistrationCode(String vatRegistrationCode) {
		this.vatRegistrationCode = vatRegistrationCode;
	}
	
}
