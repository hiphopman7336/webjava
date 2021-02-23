package com.tot.th.esb.services.dto.response;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Kritsana J. on 18/11/2563.
 */
@XmlRootElement
public class CRM_QueryCAforAllMessageDto {

	private CRM_QueryCAforAllResponseResult ResponseResult;
	private CRM_QueryCAforAllCA CA;
	
	public CRM_QueryCAforAllResponseResult getResponseResult() {
		return ResponseResult;
	}

	public void setResponseResult(CRM_QueryCAforAllResponseResult responseResult) {
		ResponseResult = responseResult;
	}

	public CRM_QueryCAforAllCA getCA() {
		return CA;
	}

	public void setCA(CRM_QueryCAforAllCA cA) {
		CA = cA;
	}
	
}
