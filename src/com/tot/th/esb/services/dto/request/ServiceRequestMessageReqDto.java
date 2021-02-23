package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
public class ServiceRequestMessageReqDto {
	private String tot_task_id; 
	private String call_number; 
	private String contact_number; 
	private String service_id; 
	private String service_type; 
	private String customer_name; 
	private String billing_account; 
	private String request_description; 
	private String request_date; 
	private String subscriber_id; 
	private String request_tracking_type; 
	private String billing_address; 
	private String installation_address;
	
	public ServiceRequestMessageReqDto(){
		
	}
	
	public ServiceRequestMessageReqDto(String tot_task_id, String call_number, String contact_number, String service_id,
			String service_type, String customer_name, String billing_account, String request_description,
			String request_date, String subscriber_id, String request_tracking_type, String billing_address,
			String installation_address) {
		this.tot_task_id = tot_task_id;
		this.call_number = call_number;
		this.contact_number = contact_number;
		this.service_id = service_id;
		this.service_type = service_type;
		this.customer_name = customer_name;
		this.billing_account = billing_account;
		this.request_description = request_description;
		this.request_date = request_date;
		this.subscriber_id = subscriber_id;
		this.request_tracking_type = request_tracking_type;
		this.billing_address = billing_address;
		this.installation_address = installation_address;
	}
	
	public String getTot_task_id() {
		return tot_task_id;
	}
	
	public void setTot_task_id(String tot_task_id) {
		this.tot_task_id = tot_task_id;
	}
	
	public String getCall_number() {
		return call_number;
	}
	
	public void setCall_number(String call_number) {
		this.call_number = call_number;
	}
	
	public String getContact_number() {
		return contact_number;
	}
	
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	
	public String getService_id() {
		return service_id;
	}
	
	public void setService_id(String service_id) {
		this.service_id = service_id;
	}
	
	public String getService_type() {
		return service_type;
	}
	
	public void setService_type(String service_type) {
		this.service_type = service_type;
	}
	
	public String getCustomer_name() {
		return customer_name;
	}
	
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	
	public String getBilling_account() {
		return billing_account;
	}
	
	public void setBilling_account(String billing_account) {
		this.billing_account = billing_account;
	}
	
	public String getRequest_description() {
		return request_description;
	}
	
	public void setRequest_description(String request_description) {
		this.request_description = request_description;
	}
	
	public String getRequest_date() {
		return request_date;
	}
	
	public void setRequest_date(String request_date) {
		this.request_date = request_date;
	}
	
	public String getSubscriber_id() {
		return subscriber_id;
	}
	
	public void setSubscriber_id(String subscriber_id) {
		this.subscriber_id = subscriber_id;
	}
	
	public String getRequest_tracking_type() {
		return request_tracking_type;
	}
	
	public void setRequest_tracking_type(String request_tracking_type) {
		this.request_tracking_type = request_tracking_type;
	}
	
	public String getBilling_address() {
		return billing_address;
	}
	
	public void setBilling_address(String billing_address) {
		this.billing_address = billing_address;
	}
	
	public String getInstallation_address() {
		return installation_address;
	}
	
	public void setInstallation_address(String installation_address) {
		this.installation_address = installation_address;
	} 
	

	
}
