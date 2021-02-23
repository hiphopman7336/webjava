package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="statusRequestResponse",strict=false)
public class StatusRequestResponse {
	@Element(required=false, name="return")
	private StatusRequestResult statusRequestResult;

	public StatusRequestResult getStatusRequestResult() {
		return statusRequestResult;
	}

	public void setStatusRequestResult(StatusRequestResult statusRequestResult) {
		this.statusRequestResult = statusRequestResult;
	}
	
}
