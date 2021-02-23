package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 2/12/2563.
 */	
@XmlRootElement
public class CRM_QueryByCitizenIDResponseResult {
	
	private String ResponseDateTime;
	private String ResponseOK;
	private String ResponseCode;
	private String ResponseDesc;

	public String getResponseDateTime() {
		return ResponseDateTime;
	}
	public void setResponseDateTime(String responseDateTime) {
		ResponseDateTime = responseDateTime;
	}
	public String getResponseOK() {
		return ResponseOK;
	}
	public void setResponseOK(String responseOK) {
		ResponseOK = responseOK;
	}
	public String getResponseCode() {
		return ResponseCode;
	}
	public void setResponseCode(String responseCode) {
		ResponseCode = responseCode;
	}
	public String getResponseDesc() {
		return ResponseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		ResponseDesc = responseDesc;
	}


}
