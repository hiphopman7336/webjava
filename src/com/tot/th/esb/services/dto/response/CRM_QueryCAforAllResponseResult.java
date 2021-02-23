package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@XmlRootElement
public class CRM_QueryCAforAllResponseResult {

	private String responseDatetime;
	private String responseOk;
	private String responseCode;
	private String responseDesc;
	
	public String getResponseDatetime() {
		return responseDatetime;
	}
	public void setResponseDatetime(String responseDatetime) {
		this.responseDatetime = responseDatetime;
	}
	public String getResponseOk() {
		return responseOk;
	}
	public void setResponseOk(String responseOk) {
		this.responseOk = responseOk;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseDesc() {
		return responseDesc;
	}
	public void setResponseDesc(String responseDesc) {
		this.responseDesc = responseDesc;
	}
	
}
