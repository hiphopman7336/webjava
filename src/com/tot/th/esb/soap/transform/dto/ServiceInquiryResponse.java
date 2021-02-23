package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="serviceInquiryResponse",strict=false)
public class ServiceInquiryResponse {
	@Element(required=false, name="return")
	private ServiceInquiryResult serviceInquiryResult;

	public ServiceInquiryResult getServiceInquiryResult() {
		return serviceInquiryResult;
	}

	public void setServiceInquiryResult(ServiceInquiryResult serviceInquiryResult) {
		this.serviceInquiryResult = serviceInquiryResult;
	}
	
}
