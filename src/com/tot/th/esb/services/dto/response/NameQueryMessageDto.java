package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@XmlRootElement
public class NameQueryMessageDto {
	
	private String total;
	private NameQueryItem[] result;
	
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
	@XmlElement(name="result")
	public NameQueryItem[] getResult() {
		return result;
	}
	public void setResult(NameQueryItem[] result) {
		this.result = result;
	}	

}


