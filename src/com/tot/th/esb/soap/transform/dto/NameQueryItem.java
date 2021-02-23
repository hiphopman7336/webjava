package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@Root(name="item",strict=false)
public class NameQueryItem {
	
	@Element(name="baId", required=false)
	private String baId;
	
	@Element(name="customerName", required=false)
	private String customerName;
	
	@Element(name="personalId", required=false)
	private String personalId;
	
	@Element(name="vatRegistrationCode", required=false)
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
