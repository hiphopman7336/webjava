package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="return",strict=false)
public class ServiceInquiryResult {

	@Element(name="response_code", required=false)
	private String response_code;
	
	@Element(name="response_message", required=false)
	private String response_message;
	
	@Element(name="cdb_transaction_id", required=false)
	private String cdb_transaction_id;
	
	@Element(name="response_date", required=false)
	private String response_date;
	
	@Element(name="total_item", required=false)
	private String total_item;
	
	@Element(name="service_items", required=false)
	private ServiceInquiryServiceItems service_items;

	public String getResponse_code() {
		return response_code;
	}

	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}

	public String getResponse_message() {
		return response_message;
	}

	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}

	public String getCdb_transaction_id() {
		return cdb_transaction_id;
	}

	public void setCdb_transaction_id(String cdb_transaction_id) {
		this.cdb_transaction_id = cdb_transaction_id;
	}

	public String getResponse_date() {
		return response_date;
	}

	public void setResponse_date(String response_date) {
		this.response_date = response_date;
	}

	public String getTotal_item() {
		return total_item;
	}

	public void setTotal_item(String total_item) {
		this.total_item = total_item;
	}

	public ServiceInquiryServiceItems getService_items() {
		return service_items;
	}

	public void setService_items(ServiceInquiryServiceItems service_items) {
		this.service_items = service_items;
	}
	
}


