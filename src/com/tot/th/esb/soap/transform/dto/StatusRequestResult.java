package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="return",strict=false)
public class StatusRequestResult {
		
	@Element(name="response_message", required=false)
	private String response_message;
	
	@Element(name="cdb_transaction_id", required=false)
	private String cdb_transaction_id;
	
	@Element(name="response_date", required=false)
	private String response_date;
	
	@Element(name="request_id", required=false)
	private String request_id;
	
	@Element(name="close_date", required=false)
	private String close_date;
	
	@Element(name="status", required=false)
	private String status;

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

	public String getRequest_id() {
		return request_id;
	}

	public void setRequest_id(String request_id) {
		this.request_id = request_id;
	}

	public String getClose_date() {
		return close_date;
	}

	public void setClose_date(String close_date) {
		this.close_date = close_date;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
