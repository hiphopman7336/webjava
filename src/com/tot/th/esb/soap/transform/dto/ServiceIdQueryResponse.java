package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 13/09/2563.
 */
@Root(name="serviceIdQueryResponse",strict=false)
public class ServiceIdQueryResponse {
	@Element(required=false, name="return")
	private ServiceIdQueryResult serviceIdQueryResult;

	public ServiceIdQueryResult getServiceIdQueryResult() {
		return serviceIdQueryResult;
	}

	public void setServiceIdQueryResult(ServiceIdQueryResult serviceIdQueryResult) {
		this.serviceIdQueryResult = serviceIdQueryResult;
	}

}
