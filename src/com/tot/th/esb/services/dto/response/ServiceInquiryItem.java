package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@XmlRootElement
public class ServiceInquiryItem {

	private String customer_number;
	private String customer_name;
	private String billing_account_number;
	private String subscriber_id;
	private String service_id;
	private String service_type;
	private String status;
	private String billing_address;
	private String installation_address;
	
	public ServiceInquiryItem(){
		
	}
		
	public ServiceInquiryItem(String customer_number, String customer_name, String billing_account_number,
			String subscriber_id, String service_id, String service_type, String status, String billing_address,
			String installation_address) {
		this.customer_number = customer_number;
		this.customer_name = customer_name;
		this.billing_account_number = billing_account_number;
		this.subscriber_id = subscriber_id;
		this.service_id = service_id;
		this.service_type = service_type;
		this.status = status;
		this.billing_address = billing_address;
		this.installation_address = installation_address;
	}



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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
