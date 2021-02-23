package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="serviceRequestResponse",strict=false)
public class ServiceRequestResponse {
	@Element(required=false, name="return")
	private ServiceRequestResult serviceRequestResult;

	public ServiceRequestResult getServiceRequestResult() {
		return serviceRequestResult;
	}

	public void setServiceRequestResult(ServiceRequestResult serviceRequestResult) {
		this.serviceRequestResult = serviceRequestResult;
	}
}
