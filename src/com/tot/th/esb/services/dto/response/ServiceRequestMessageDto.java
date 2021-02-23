package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@XmlRootElement
public class ServiceRequestMessageDto {

	private String response_message;
	private String response_date;
	private String response_code;
	private String cdb_transaction_id;
	private String response_cat_task_id;
	private String response_success_flag;
	
	public String getResponse_message() {
		return response_message;
	}
	public void setResponse_message(String response_message) {
		this.response_message = response_message;
	}
	public String getResponse_date() {
		return response_date;
	}
	public void setResponse_date(String response_date) {
		this.response_date = response_date;
	}
	public String getResponse_code() {
		return response_code;
	}
	public void setResponse_code(String response_code) {
		this.response_code = response_code;
	}
	public String getCdb_transaction_id() {
		return cdb_transaction_id;
	}
	public void setCdb_transaction_id(String cdb_transaction_id) {
		this.cdb_transaction_id = cdb_transaction_id;
	}
	public String getResponse_cat_task_id() {
		return response_cat_task_id;
	}
	public void setResponse_cat_task_id(String response_cat_task_id) {
		this.response_cat_task_id = response_cat_task_id;
	}
	public String getResponse_success_flag() {
		return response_success_flag;
	}
	public void setResponse_success_flag(String response_success_flag) {
		this.response_success_flag = response_success_flag;
	}
}
