package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="return",strict=false)
public class ServiceRequestResult {
	   
		@Element(name="response_message", required=false)
		private String response_message;
		
		@Element(name="response_date", required=false)
		private String response_date;
		
		@Element(name="response_code", required=false)
		private String response_code;
		
		@Element(name="cdb_transaction_id", required=false)
		private String cdb_transaction_id;
		
		@Element(name="response_cat_task_id", required=false)
		private String response_cat_task_id;
		
		@Element(name="response_success_flag", required=false)
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
