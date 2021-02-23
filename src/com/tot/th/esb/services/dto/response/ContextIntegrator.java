package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 1/12/2563.
 */	
@XmlRootElement
public class ContextIntegrator {
	
	private Message message;

	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}
	
	
}
