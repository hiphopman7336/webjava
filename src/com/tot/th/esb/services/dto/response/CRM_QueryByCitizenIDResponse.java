package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 2/12/2563.
 */	
@XmlRootElement
public class CRM_QueryByCitizenIDResponse {
	
	private ContextIntegrator contextIntegrator;
	private CRM_QueryByCitizenIDMessageDto body;
	
	public ContextIntegrator getContextIntegrator() {
		return contextIntegrator;
	}
	
	public void setContextIntegrator(ContextIntegrator contextIntegrator) {
		this.contextIntegrator = contextIntegrator;
	}
	
	public CRM_QueryByCitizenIDMessageDto getBody() {
		return body;
	}
	
	public void setBody(CRM_QueryByCitizenIDMessageDto body) {
		this.body = body;
	}		
	
}
