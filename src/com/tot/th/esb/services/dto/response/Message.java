package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 1/12/2563.
 */	
@XmlRootElement
public class Message {
	
	private IntegrationResult integrationResult;

	public IntegrationResult getIntegrationResult() {
		return integrationResult;
	}

	public void setIntegrationResult(IntegrationResult integrationResult) {
		this.integrationResult = integrationResult;
	}
	
	
	
}
