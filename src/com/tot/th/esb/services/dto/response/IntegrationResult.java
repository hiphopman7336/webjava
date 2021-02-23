package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 1/12/2563.
 */	
@XmlRootElement
public class IntegrationResult {

	private boolean result;
	private String esbReturnCode;
	private String esbReturnMsg;
	private String destinationReturnCode;
	private String destinationReturnMsg;
	
	
	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public String getEsbReturnCode() {
		return esbReturnCode;
	}
	
	public void setEsbReturnCode(String esbReturnCode) {
		this.esbReturnCode = esbReturnCode;
	}
	
	public String getEsbReturnMsg() {
		return esbReturnMsg;
	}
	
	public void setEsbReturnMsg(String esbReturnMsg) {
		this.esbReturnMsg = esbReturnMsg;
	}
	
	public String getDestinationReturnCode() {
		return destinationReturnCode;
	}
	
	public void setDestinationReturnCode(String destinationReturnCode) {
		this.destinationReturnCode = destinationReturnCode;
	}
	
	public String getDestinationReturnMsg() {
		return destinationReturnMsg;
	}
	
	public void setDestinationReturnMsg(String destinationReturnMsg) {
		this.destinationReturnMsg = destinationReturnMsg;
	}
	
}
