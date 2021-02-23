package com.tot.th.esb.soap.transform.dto;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * Created by Kritsana J. on 06/08/2563.
 */
@Root(name="customerInquiryResponse",strict=false)
public class CustomerInquiryResponse {
	@Element(required=false, name="return")
	private CustomerInquiryResult customerInquiryResult;

	public CustomerInquiryResult getCustomerInquiryResult() {
		return customerInquiryResult;
	}

	public void setCustomerInquiryResult(CustomerInquiryResult customerInquiryResult) {
		this.customerInquiryResult = customerInquiryResult;
	}
	
}
