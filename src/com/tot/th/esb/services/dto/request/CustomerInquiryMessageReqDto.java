package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
public class CustomerInquiryMessageReqDto {

	private String customer_name;
	
	public CustomerInquiryMessageReqDto() {
		
	}
	
	public CustomerInquiryMessageReqDto(String customer_name) {
		this.customer_name = customer_name;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
}
