package com.tot.th.esb.services.dto.request;

/**
 * Created by Kritsana J. on 30/11/2563.
 */
public class HeaderDto {
	
	private String transactionId;
	private String integrationKeyRef;
	
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getIntegrationKeyRef() {
		return integrationKeyRef;
	}
	public void setIntegrationKeyRef(String integrationKeyRef) {
		this.integrationKeyRef = integrationKeyRef;
	}
	

}
