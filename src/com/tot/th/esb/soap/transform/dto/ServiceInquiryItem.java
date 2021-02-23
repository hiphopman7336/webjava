package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="item",strict=false)
public class ServiceInquiryItem {
	
	@Element(name="customer_number", required=false)
	private String customer_number;
	
	@Element(name="customer_name", required=false)
	private String customer_name;
	
	@Element(name="billing_account_number", required=false)
	private String billing_account_number;
	
	@Element(name="subscriber_id", required=false)
	private String subscriber_id;
	
	@Element(name="service_id", required=false)
	private String service_id;
	
	@Element(name="service_type", required=false)
	private String service_type;
	
	@Element(name="status", required=false)
	private String status;

	@Element(name="billing_address", required=false)
	private String billing_address;
	
	@Element(name="installation_address", required=false)
	private String installation_address;
	
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
