package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
public class ServiceInquiryMessageReqDto {
	
	private String customer_number;	
	private String service_id;
	private String billing_account_number;
	private String subscriber_id;
		
	public ServiceInquiryMessageReqDto(){
		
	}
	
	public ServiceInquiryMessageReqDto(String customer_number, String service_id, String billing_account_number,
			String subscriber_id) {
		this.customer_number = customer_number;
		this.service_id = service_id;
		this.billing_account_number = billing_account_number;
		this.subscriber_id = subscriber_id;
	}
	
	public String getCustomer_number() {
		return customer_number;
	}
	
	public void setCustomer_number(String customer_number) {
		this.customer_number = customer_number;
	}
	
	public String getService_id() {
		return service_id;
	}
	
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	
	public String getBilling_account_number() {
		return billing_account_number;
	}
	
	public void setBilling_account_number(String billing_account_number) {
		this.billing_account_number = billing_account_number;
	}
	
	public String getSubscriber_id() {
		return subscriber_id;
	}
	
	public void setSubscriber_id(String subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
	
}


