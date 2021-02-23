package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 1/12/2563.
 */	
@XmlRootElement
public class CRM_QueryCAforAllResponse {
	
	private ContextIntegrator contextIntegrator;
	private CRM_QueryCAforAllMessageDto body;
	
	public ContextIntegrator getContextIntegrator() {
		return contextIntegrator;
	}
	public void setContextIntegrator(ContextIntegrator contextIntegrator) {
		this.contextIntegrator = contextIntegrator;
	}
	public CRM_QueryCAforAllMessageDto getBody() {
		return body;
	}
	public void setBody(CRM_QueryCAforAllMessageDto body) {
		this.body = body;
	}
	
}
