package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@XmlRootElement
public class ServiceInquiryMessageDto {
	
	private String response_code;	
	private String response_message;
	private String cdb_transaction_id;
	private String response_date;
	private String total_item;
	private ServiceInquiryItem[] service_item;	

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
	@XmlElement(name="service_item")
	public ServiceInquiryItem[] getItem() {
		return service_item;
	}

	public void setItem(ServiceInquiryItem[] service_item) {
		this.service_item = service_item;
	}
	
}


