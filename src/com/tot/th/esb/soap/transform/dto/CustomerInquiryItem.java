package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="item",strict=false)
public class CustomerInquiryItem {
	
	@Element(name="customer_number", required=false)
	private String customer_number;
	
	@Element(name="customer_name", required=false)
	private String customer_name;
	
	@Element(name="registered_id", required=false)
	private String registered_id;
	
	@Element(name="birth_date", required=false)
	private String birth_date;

	public String getCustomer_number() {
		return customer_number;
	}

	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getRegistered_id() {
		return registered_id;
	}

	public void setRegistered_id(String registered_id) {
		this.registered_id = registered_id;
	}

	public String getBirth_date() {
		return birth_date;
	}

	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	
}
